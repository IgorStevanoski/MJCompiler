// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclaration implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private MethodTypeName methodTypeName;
    private FormPars formPars;
    private VarDeclListSemi varDeclListSemi;
    private StatementList statementList;

    public MethodDeclaration (MethodTypeName methodTypeName, FormPars formPars, VarDeclListSemi varDeclListSemi, StatementList statementList) {
        this.methodTypeName=methodTypeName;
        if(methodTypeName!=null) methodTypeName.setParent(this);
        this.formPars=formPars;
        if(formPars!=null) formPars.setParent(this);
        this.varDeclListSemi=varDeclListSemi;
        if(varDeclListSemi!=null) varDeclListSemi.setParent(this);
        this.statementList=statementList;
        if(statementList!=null) statementList.setParent(this);
    }

    public MethodTypeName getMethodTypeName() {
        return methodTypeName;
    }

    public void setMethodTypeName(MethodTypeName methodTypeName) {
        this.methodTypeName=methodTypeName;
    }

    public FormPars getFormPars() {
        return formPars;
    }

    public void setFormPars(FormPars formPars) {
        this.formPars=formPars;
    }

    public VarDeclListSemi getVarDeclListSemi() {
        return varDeclListSemi;
    }

    public void setVarDeclListSemi(VarDeclListSemi varDeclListSemi) {
        this.varDeclListSemi=varDeclListSemi;
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList=statementList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(methodTypeName!=null) methodTypeName.accept(visitor);
        if(formPars!=null) formPars.accept(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.accept(visitor);
        if(statementList!=null) statementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(methodTypeName!=null) methodTypeName.traverseTopDown(visitor);
        if(formPars!=null) formPars.traverseTopDown(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.traverseTopDown(visitor);
        if(statementList!=null) statementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(methodTypeName!=null) methodTypeName.traverseBottomUp(visitor);
        if(formPars!=null) formPars.traverseBottomUp(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.traverseBottomUp(visitor);
        if(statementList!=null) statementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclaration(\n");

        if(methodTypeName!=null)
            buffer.append(methodTypeName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(formPars!=null)
            buffer.append(formPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(varDeclListSemi!=null)
            buffer.append(varDeclListSemi.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(statementList!=null)
            buffer.append(statementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclaration]");
        return buffer.toString();
    }
}
