package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import java.util.List;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CodeGenerator extends VisitorAdaptor {
	
	private int varCount;
	
	private int paramCnt;
	
	private int mainPc;
	
	public int getMainPc() {
		return mainPc;
	}
	
	private int addopSign = 0;
	private int mulopSign = 0;
	
	private Obj arrayObj;
	private List<Obj> arrayList = new ArrayList<Obj>();
	
	public void visit(Print_NONUM_Statement printStmt){
		if( printStmt.getExpr().struct == Tab.intType ){
			Code.loadConst(5);
			Code.put(Code.print);
		} else if( printStmt.getExpr().struct == SemanticAnalyzer.boolType ){
//			Code.put(Code.pop);
//			Code.load(new Obj(Obj.Con, "$", Tab.charType, 't', 0));
//			Code.loadConst(1);
//			Code.put(Code.bprint);
//			Code.load(new Obj(Obj.Con, "$", Tab.charType, 'r', 0));
//			Code.loadConst(1);
//			Code.put(Code.bprint);
//			Code.load(new Obj(Obj.Con, "$", Tab.charType, 'u', 0));
//			Code.loadConst(1);
//			Code.put(Code.bprint);
//			Code.load(new Obj(Obj.Con, "$", Tab.charType, 'e', 0));
//			Code.loadConst(1);
//			Code.put(Code.bprint);
			Code.loadConst(5);
			Code.put(Code.print);			
		} else {
			Code.loadConst(1);
			Code.put(Code.bprint);			
		}
	}
	
	public void visit(Read_Statement readStmt){
		if( readStmt.getDesignator().obj.getType() == Tab.intType ){
			Code.put(Code.read);
			Code.store(readStmt.getDesignator().obj);
		} else if( readStmt.getDesignator().obj.getType() == SemanticAnalyzer.boolType ){
			Code.put(Code.read);			
			Code.store(readStmt.getDesignator().obj);
		} else {
			Code.put(Code.bread);			
			Code.store(readStmt.getDesignator().obj);
		}
	}

	@Override
	public void visit(MethodRetTypeName MethodTypeName) {
		if ("main".equalsIgnoreCase(MethodTypeName.getMethName())) {
			mainPc = Code.pc;
		}
		MethodTypeName.obj.setAdr(Code.pc);
		
		// Collect arguments and local variables.
		SyntaxNode methodNode = MethodTypeName.getParent();
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry.
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(varCnt.getCount() + fpCnt.getCount());
	}
	
	@Override
	public void visit(MethodVoidName MethodName) {
		if ("main".equalsIgnoreCase(MethodName.getMethName())) {
			mainPc = Code.pc;
		}
		MethodName.obj.setAdr(Code.pc);
		
		// Collect arguments and local variables.
		SyntaxNode methodNode = MethodName.getParent();
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry.
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(varCnt.getCount() + fpCnt.getCount());
	}
	
	@Override
	public void visit(MethodDeclaration MethodDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	@Override
	public void visit(Return_Expr_Statement ReturnExpr) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	@Override
	public void visit(Return_NoExpr_Statement ReturnExpr) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}	
	
	@Override
	public void visit(AssignStatement assignment) {
		if (assignment.getDesignator().obj.getKind() != Obj.Elem) {
			Code.store(assignment.getDesignator().obj);			
		} else {
			if (assignment.getDesignator().obj.getType() != Tab.charType)
				Code.put(Code.astore);
			else 
				Code.put(Code.bastore);				
		}
	}
	
	@Override
	public void visit(ArrayAssignStatement assignment) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getType() == Tab.noType) continue;
			if (arrayList.get(i).getKind() == Obj.Elem) {
				continue;
			} else {
				Code.load(assignment.getDesignator().obj);
				Code.loadConst(i);
				Code.put(Code.aload);
				Code.store(arrayList.get(i));				
			}
		}
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (arrayList.get(i).getType() == Tab.noType) continue;
			if (arrayList.get(i).getKind() == Obj.Elem) {
				Code.load(assignment.getDesignator().obj);
				Code.loadConst(i);
				Code.put(Code.aload);
				Code.put(Code.astore);
			} else {
				continue;		
			}
		}
		arrayList.clear();
	}
	
	@Override
	public void visit(DesignatorOptional designator) {
		arrayList.add(designator.obj);
	}
	
	@Override
	public void visit(DesignatorOptionalNone designator) {
		arrayList.add(new Obj(Obj.NO_VALUE, "/", Tab.noType));
	}
	
	@Override
	public void visit(Designator_Ident designator) {
		SyntaxNode parent = designator.getParent();
		if (ArrayAssignStatement.class == parent.getClass()) {
			arrayObj = designator.obj;
		}
		else if (AssignStatement.class != parent.getClass()
				&& DesignatorOptional.class != parent.getClass()) {
			Code.load(designator.obj);
		}
	}
	
	@Override
	public void visit(DesignatorName designatorName) {
		SyntaxNode parent = designatorName.getParent();
		Obj obj = Tab.find(designatorName.getDesignatorName());
		if (Designator_ArrayElem.class == parent.getClass()) {
			Code.load(designatorName.obj);
		}
	}
	
	@Override
	public void visit(Designator_ArrayElem designator) {
		SyntaxNode parent = designator.getParent();
		if (AssignStatement.class != parent.getClass() 
				&& DesignatorOptional.class != parent.getClass()) {
			Code.load(designator.obj);
		}
	}
	
	@Override
	public void visit(Factor_New_Array factor) {
		if (factor.getType().struct == Tab.intType 
				|| factor.getType().struct == SemanticAnalyzer.boolType) {
			Code.put(Code.newarray);
			Code.put(1);			
		} else {
			Code.put(Code.newarray);
			Code.put(0);						
		}
	}
	
	public void visit(Factor_Number number) {
		Code.load(new Obj(Obj.Con, "$", number.struct, number.getN1(), 0));
	}
	
	public void visit(Factor_Character character) {
		Code.load(new Obj(Obj.Con, "$", character.struct, character.getC1(), 0));
	}

	public void visit(Factor_Bool bool) {
		char c = bool.getB1().charAt(0);
		if (c == 't') {
			Code.load(new Obj(Obj.Con, "$", bool.struct, 1, 0));			
		} else {
			Code.load(new Obj(Obj.Con, "$", bool.struct, 0, 0));						
		}
	}
	
	@Override
	public void visit(NegativeExpr negExpr) {
		Code.put(Code.neg);
	}
	
	@Override
	public void visit(IncStatement stmt) {
		Code.loadConst(1);
		Code.put(Code.add);
		Code.store(stmt.getDesignator().obj);
	}
	
	@Override
	public void visit(DecStatement stmt) {
		Code.loadConst(-1);
		Code.put(Code.add);
		Code.store(stmt.getDesignator().obj);
	}
	
	@Override
	public void visit(Addop_Terms addopTerms) {
		if ( addopSign == 0 ){
			Code.put(Code.add);			
		} else {
			Code.put(Code.sub);						
		}
	}

	@Override
	public void visit(Term_Factors mulopTerms) {
		if ( mulopSign == 0 ){
			Code.put(Code.mul);			
		} else if ( mulopSign == 1 ){
			Code.put(Code.div);			
		} else {
			Code.put(Code.rem);						
		}
	}

	@Override
	public void visit(Add_Operation op) {
		addopSign = 0;
	}
	@Override
	public void visit(SUB_Operation op) {
		addopSign = 1;
	}

	@Override
	public void visit(Multiply op) {
		mulopSign = 0;
	}
	@Override
	public void visit(Divide op) {
		mulopSign = 1;
	}
	@Override
	public void visit(Module op) {
		mulopSign = 2;
	}
	
	@Override
	public void visit(VarDeclNoBracket varDecl) {
		varCount++;
	}
		
	
	// bool tip u print da se ispisuje kao true/false, a ne 1/0
	// chr, ord, len
	// read				+
	// nizovi			+
	// [...] = ...; 	+
	// prijavljivanje greske pri dodeli
	// format predaje projekta
	
}
