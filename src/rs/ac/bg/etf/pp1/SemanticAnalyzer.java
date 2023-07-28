package rs.ac.bg.etf.pp1;
import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

//public class RuleVisitor
public class SemanticAnalyzer extends VisitorAdaptor {
	
	boolean errorDetected = false;
	int printCallCount = 0;
	Obj currentMethod = null;
	boolean returnFound = false;
	int nVars;
	Type currentType = null;

	public static final Struct boolType = new Struct(SemanticAnalyzer.Bool);
	public static final Struct arrayIntType = new Struct( Struct.Array, Tab.intType);
	public static final Struct arrayCharType = new Struct( Struct.Array, Tab.charType);
	public static final Struct arrayBoolType = new Struct( Struct.Array, boolType);
	public static final int Bool = 5;
	
	Logger log = Logger.getLogger(getClass());

	public SemanticAnalyzer() {
		Tab.insert(Obj.Type, "bool", boolType);
	}

	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	public void visit(ProgName progName) {
		progName.obj = Tab.insert(Obj.Prog, progName.getPName(), Tab.noType);
		Tab.openScope();     	
	}
	
	public void visit(ProgramMethods program) {		
		nVars = Tab.currentScope.getnVars();
		Tab.chainLocalSymbols(program.getProgName().obj);
		Tab.closeScope();
	}

	public void visit(ProgramNoMethods program) {		
		nVars = Tab.currentScope.getnVars();
		Tab.chainLocalSymbols(program.getProgName().obj);
		Tab.closeScope();
	}
	
	public void visit(VarDeclNoBracket varDecl) {
		report_info("Deklarisana promenljiva "+ varDecl.getVarName() + " tipa " + currentType.getTypeName(), varDecl);
		Obj obj = Tab.find(varDecl.getVarName());
		Obj varNode = Tab.insert(Obj.Var, varDecl.getVarName(), currentType.struct);
		if (obj != Tab.noObj) {
			if ( obj.getLevel() == Tab.find(varDecl.getVarName()).getLevel())
				report_error("Greska na liniji " + varDecl.getLine()+ " : ime "+ varDecl.getVarName() +" je vec deklarisano! ", null);
		}
	}
	
	public void visit(VarDeclBracket varDecl) {
		Obj obj = Tab.find(varDecl.getVarName());
		report_info("Deklarisana promenljiva "+ varDecl.getVarName(), varDecl);
		Obj varNode;
		if (currentType.struct == Tab.intType) varNode = Tab.insert(Obj.Var, varDecl.getVarName(), arrayIntType);
		else if (currentType.struct == Tab.charType) varNode = Tab.insert(Obj.Var, varDecl.getVarName(), arrayCharType);
		else if (currentType.struct == boolType) varNode = Tab.insert(Obj.Var, varDecl.getVarName(), arrayBoolType);
		if (obj != Tab.noObj) {
			if ( obj.getLevel() == Tab.find(varDecl.getVarName()).getLevel())
				report_error("Greska na liniji " + varDecl.getLine()+ " : ime "+ varDecl.getVarName() +" je vec deklarisano! ", null);
		}
	}
	
	public void visit(ConstDeclNumber constDeclNumber) {
		Obj obj = Tab.find(constDeclNumber.getConstName());
		Obj varNode = Tab.insert(Obj.Con, constDeclNumber.getConstName(), currentType.struct);
		if (obj != Tab.noObj) {
			if ( obj.getLevel() == Tab.find(constDeclNumber.getConstName()).getLevel())
				report_error("Greska na liniji " + constDeclNumber.getLine()+ " : ime "+ constDeclNumber.getConstName() +" je vec deklarisano! ", null);
		}
		varNode.setAdr(constDeclNumber.getVal());
		if (currentType.struct.getKind() != Struct.Int) {
			report_error("Semanticka greska na liniji " + constDeclNumber.getLine() + ": konstanta " + constDeclNumber.getConstName() 
			+ " nije definisana odgovarajucim tipom!", null);
		} else {
			report_info("Deklarisana konstanta "+ constDeclNumber.getConstName() + " sa vrednoscu: " 
					+ constDeclNumber.getVal(), constDeclNumber);			
		}
	}
	
	public void visit(ConstDeclChar constDeclChar) {
		Obj obj = Tab.find(constDeclChar.getConstName());
		Obj varNode = Tab.insert(Obj.Con, constDeclChar.getConstName(), currentType.struct);
		varNode.setAdr(constDeclChar.getVal());
		if (obj != Tab.noObj) {
			if ( obj.getLevel() == Tab.find(constDeclChar.getConstName()).getLevel())
				report_error("Greska na liniji " + constDeclChar.getLine()+ " : ime "+ constDeclChar.getConstName() +" je vec deklarisano! ", null);
		}
		if (currentType.struct.getKind() != Struct.Char) {
			report_error("Semanticka greska na liniji " + constDeclChar.getLine() + ": konstanta " + constDeclChar.getConstName() 
			+ " nije definisana odgovarajucim tipom!", null);
		} else {
			report_info("Deklarisana konstanta "+ constDeclChar.getConstName() + " sa vrednoscu: " 
					+ constDeclChar.getVal(), constDeclChar);
		}
	}
	
	public void visit(ConstDeclBool constDeclBool) {
		Obj obj = Tab.find(constDeclBool.getConstName());
		Obj varNode = Tab.insert(Obj.Con, constDeclBool.getConstName(), currentType.struct);
		if (obj != Tab.noObj) {
			if ( obj.getLevel() == Tab.find(constDeclBool.getConstName()).getLevel())
				report_error("Greska na liniji " + constDeclBool.getLine()+ " : ime "+ constDeclBool.getConstName() +" je vec deklarisano! ", null);
		}
		if (constDeclBool.getVal().contentEquals("true")) {
			varNode.setAdr(1);
		} else {
			varNode.setAdr(0);
		}
		report_info("Deklarisana konstanta "+ constDeclBool.getConstName() + " sa vrednoscu: " 
				+ constDeclBool.getVal(), constDeclBool);
	}
	
	public void visit(Type type) {
		Obj typeNode = Tab.find(type.getTypeName());
		if (typeNode == Tab.noObj) {
			report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola", null);
			type.struct = Tab.noType;
		} 
		else {
			if (Obj.Type == typeNode.getKind()) {
				type.struct = typeNode.getType();
				this.currentType = type;
			} 
			else {
				report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip ", type);
				type.struct = Tab.noType;
			}
		}  
	}
	
	public void visit(MethodDeclaration methodDecl) {
		if (!returnFound && currentMethod.getType() != Tab.noType) {
			report_error("Semanticka greska na liniji " + methodDecl.getLine() + ": funcija " + currentMethod.getName() + " nema return iskaz!", null);
		}
		Tab.chainLocalSymbols(currentMethod);
		Tab.closeScope();
		
		returnFound = false;
		currentMethod = null;
	}
	
	public void visit(MethodRetTypeName methodTypeName) {
		currentMethod = Tab.insert(Obj.Meth, methodTypeName.getMethName(), currentType.struct);
		methodTypeName.obj = currentMethod;
		Tab.openScope();
		report_info("Obradjuje se funkcija " + methodTypeName.getMethName(), methodTypeName);
	}
	
	public void visit(MethodVoidName methodTypeName) {
		currentMethod = Tab.insert(Obj.Meth, methodTypeName.getMethName(), Tab.noType);
		methodTypeName.obj = currentMethod;
		Tab.openScope();
		report_info("Obradjuje se funkcija " + methodTypeName.getMethName(), methodTypeName);
	}
	
	public void visit(Return_Expr_Statement returnExpr){
		returnFound = true;
		Struct currMethType = currentMethod.getType();
		if (!currMethType.compatibleWith(returnExpr.getExpr().struct)) {
			report_error("Greska na liniji " + returnExpr.getLine() + " : " + "tip izraza u return naredbi ne slaze se sa tipom povratne vrednosti funkcije " + currentMethod.getName(), null);
		}			  	     	
	}
	
	public void visit(NegativeExpr expr) {
		expr.struct = expr.getAddopTerm().struct;
	}

	public void visit(PositiveExpr expr) {
		expr.struct = expr.getAddopTerm().struct;
	}
	
	public void visit(Addop_Terms addopTerms) {
		Struct addopterm = addopTerms.getAddopTerm().struct;
		Struct term = addopTerms.getTerm().struct;
		if (addopterm.equals(term) && addopterm == Tab.intType)
			addopTerms.struct = addopterm;
		else {
			report_error("Greska na liniji "+ addopTerms.getLine()+" : nekompatibilni tipovi u izrazu za sabiranje.", null);
			addopTerms.struct = Tab.noType;
		} 
	}
	
	public void visit(Addop_Term addopTerm) {
		addopTerm.struct = addopTerm.getTerm().struct; 
	}
	
	public void visit(Term_Factor termFactor) {
		termFactor.struct = termFactor.getFactor().struct; 
	}
	
	public void visit(Term_Factors termFactors) {
		Struct term 	= termFactors.getTerm().struct;
		Struct factor 	= termFactors.getFactor().struct;
		if (term.equals(factor) && term == Tab.intType)
			termFactors.struct = term;
		else if ( term.equals(factor) && term.getKind() == Struct.Array) {
			termFactors.struct = term;
		} else if (term.getKind() == Struct.Array && factor.getKind() == Struct.Int) {
			termFactors.struct = factor;
		}	else if (factor.getKind() == Struct.Array && term.getKind() == Struct.Int) {
			termFactors.struct = term;
		} else {
			report_error("Greska na liniji "+ termFactors.getLine()+" : nekompatibilni tipovi u izrazu za mnozenje.", null);
			termFactors.struct = Tab.noType;
		} 
	}
	
	public void visit(Factor_Designator factorDesignator) {
		factorDesignator.struct = factorDesignator.getDesignator().obj.getType(); 
	}
	
	public void visit(Factor_Number factorDesignator) {
		factorDesignator.struct = Tab.intType; 
	}

	public void visit(Factor_Character factorDesignator) {
		factorDesignator.struct = Tab.charType; 
	}
	
	public void visit(Factor_Bool factorDesignator) {
		factorDesignator.struct = SemanticAnalyzer.boolType; 
	}

	public void visit(Factor_Expr factorExpr) {
		factorExpr.struct = factorExpr.getExpr().struct; 
	}

	public void visit(Designator_Ident designator){
		Obj obj = Tab.find(designator.getDesignatorName().getDesignatorName());
		if (obj == Tab.noObj) { 
			report_error("Greska na liniji " + designator.getLine()+ " : ime "+designator.getDesignatorName()+" nije deklarisano! ", null);
		}
		designator.obj = obj;
	}

	public void visit(DesignatorName designator){
		Obj obj = Tab.find(designator.getDesignatorName());
		if (obj == Tab.noObj) { 
			report_error("Greska na liniji " + designator.getLine()+ " : ime "+designator.getDesignatorName()+" nije deklarisano! ", null);
		}
		designator.obj = obj;
	}
	
	public void visit(Designator_ArrayElem designator){
		Obj obj = Tab.find(designator.getDesignatorName().getDesignatorName());
		if (obj == Tab.noObj) { 
			report_error("Greska na liniji " + designator.getLine()+ " : ime "+designator.getDesignatorName()+" nije deklarisano! ", null);
		} if (!(designator.getExpr().struct == Tab.intType
				|| designator.getExpr().struct.getElemType() == Tab.intType)) {
			report_error("Greska na liniji " + designator.getLine()+ " neodgovarajuci tip za index niza.", null);
		}
		//designator.obj = obj;
		designator.obj = new Obj(Obj.Elem, designator.getDesignatorName().getDesignatorName(), 
				obj.getType().getElemType(), obj.getAdr(), obj.getLevel());
	}
	
	public void visit(Designator_List designatorList){
		Struct designators = designatorList.getDesignatorList().struct;
		Struct designator = designatorList.getDesignatorOpt().obj.getType();
		if (designators.getKind() == Struct.Array) {
			designators = designators.getElemType();
		}
		if (designator.getKind() == Struct.Array) {
			designator = designator.getElemType();
		}
		if (designators.equals(designator) && designators == Tab.intType) {
			designatorList.struct = designators;			
		} else if (designator == Tab.noType && designators == Tab.intType
				|| designator == Tab.intType && designators == Tab.noType) {
			designatorList.struct = Tab.intType;		
		} else if (designator == Tab.noType && designators == Tab.charType
				|| designator == Tab.charType && designators == Tab.noType) {
			designatorList.struct = Tab.charType;		
		} else if (designator == Tab.noType && designators == boolType
				|| designator == boolType && designators == Tab.noType) {
			designatorList.struct = boolType;		
		} else if (designator == Tab.noType && designators == Tab.noType) {
			designatorList.struct = Tab.noType;			
		} else {
			report_error("Greska na liniji "+ designatorList.getLine()+" : nekompatibilni tipovi u nizu.", null);
			designatorList.struct = Tab.noType;		
		}
	}

	public void visit(Designator_Opt designator){
		if (designator.getDesignatorOpt().obj.getType().getKind() == Struct.Array) {
			designator.struct = designator.getDesignatorOpt().obj.getType().getElemType();
		} else {
			designator.struct = designator.getDesignatorOpt().obj.getType();			
		}
	}

	public void visit(DesignatorOptional designator){
		designator.obj = designator.getDesignator().obj;
		if (designator.obj.getKind() == Obj.Con) {
			report_error("Greska na liniji "+ designator.getLine()+" : ne moze se konstanti dodavati vrednost.", null);	
		}
	}
	
	public void visit(DesignatorOptionalNone designator){
		designator.obj = Tab.noObj;
	}
	
	public void visit(ArrayAssignStatement assignment) {
		Struct designatorsList = assignment.getDesignatorList().struct;
		Struct designator = assignment.getDesignator().obj.getType();
		if (!(designator.getKind() == Struct.Array)) {
			report_error("Greska na liniji "+ assignment.getLine()+" : desni operand nije niz.", null);
		} else if ( !(designator.getElemType().getKind() == designatorsList.getKind())) {
			report_error("Greska na liniji "+ assignment.getLine()+" : nekompatibilni tipovi u izrazu za dodelu niza.", null);			
		}
	}
	
	public void visit(Factor_New_Array factorNewArray) {
		factorNewArray.struct = factorNewArray.getType().struct;
	}

	public void visit(AssignStatement assignment) {
		if (assignment.getDesignator().obj.getKind() == Obj.Con) {
			report_error("Greska na liniji " + assignment.getLine() + " : " + "ne moze se redefinisati konstanta! ", null);
		} else if ( assignment.getDesignator().obj.getType().getKind() == Struct.Array) {
			if (!assignment.getExpr().struct.assignableTo(assignment.getDesignator().obj.getType().getElemType()))
				report_error("Greska na liniji " + assignment.getLine() + " : " + "nekompatibilni tipovi u dodeli vrednosti ", null);
		} else if ( assignment.getExpr().struct.getKind() == Struct.Array) {
			if (!assignment.getExpr().struct.getElemType().assignableTo(assignment.getDesignator().obj.getType()))
				report_error("Greska na liniji " + assignment.getLine() + " : " + "nekompatibilni tipovi u dodeli vrednosti ", null);
		} else {			
			if (!assignment.getExpr().struct.assignableTo(assignment.getDesignator().obj.getType()))
				report_error("Greska na liniji " + assignment.getLine() + " : " + "nekompatibilni tipovi u dodeli vrednosti ", null);
		} 
	}
	
	public void visit(IncStatement statement) {
		if (statement.getDesignator().obj.getKind() == Obj.Con) {
			report_error("Greska na liniji " + statement.getLine() + " : " + "konstanta se ne moze inkrementirati! ", null);			
		} else if (statement.getDesignator().obj.getType() != Tab.intType)
			report_error("Greska na liniji " + statement.getLine() + " : " + "promenljiva datog tipa se ne moze inkrementirati! ", null);
	}
	
	public void visit(DecStatement statement) {
		if (statement.getDesignator().obj.getKind() == Obj.Con) {
			report_error("Greska na liniji " + statement.getLine() + " : " + "konstanta se ne moze dekrementirati! ", null);			
		} else if (statement.getDesignator().obj.getType() != Tab.intType)
			report_error("Greska na liniji " + statement.getLine() + " : " + "promenljiva datog tipa se ne moze dekrementirati! ", null);
	}

	public void visit(Print_NONUM_Statement printStmt){
		if (printStmt.getExpr().struct != Tab.intType && printStmt.getExpr().struct != Tab.charType 
			&& printStmt.getExpr().struct != boolType)
			report_error("Greska na liniji " + printStmt.getLine() + " izraz u print naredbi mora biti tipa int ili char.", null);
		printCallCount++;    	
	}
	
	// nizovi								+
	// Factor_Expr							+
	// vardecl za vec deklarisanu prom		+
	// print read							+
	// bool									+
	
	
	/*


	public void visit(FuncCall funcCall){
		Obj func = funcCall.getDesignator().obj;
		if (Obj.Meth == func.getKind()) { 
			report_info("Pronadjen poziv funkcije " + func.getName() + " na liniji " + funcCall.getLine(), null);
			funcCall.struct = func.getType();
		} 
		else {
			report_error("Greska na liniji " + funcCall.getLine()+" : ime " + func.getName() + " nije funkcija!", null);
			funcCall.struct = Tab.noType;
		}

	}
	*/
	public boolean passed() {
		return !errorDetected;
	}
	
}

