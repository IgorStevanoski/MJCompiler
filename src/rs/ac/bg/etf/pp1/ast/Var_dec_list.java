// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Var_dec_list extends VarDeclList {

    private VarDeclList varDeclList;
    private VarDecl varDecl;

    public Var_dec_list (VarDeclList varDeclList, VarDecl varDecl) {
        this.varDeclList=varDeclList;
        if(varDeclList!=null) varDeclList.setParent(this);
        this.varDecl=varDecl;
        if(varDecl!=null) varDecl.setParent(this);
    }

    public VarDeclList getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(VarDeclList varDeclList) {
        this.varDeclList=varDeclList;
    }

    public VarDecl getVarDecl() {
        return varDecl;
    }

    public void setVarDecl(VarDecl varDecl) {
        this.varDecl=varDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclList!=null) varDeclList.accept(visitor);
        if(varDecl!=null) varDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclList!=null) varDeclList.traverseTopDown(visitor);
        if(varDecl!=null) varDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclList!=null) varDeclList.traverseBottomUp(visitor);
        if(varDecl!=null) varDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Var_dec_list(\n");

        if(varDeclList!=null)
            buffer.append(varDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(varDecl!=null)
            buffer.append(varDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Var_dec_list]");
        return buffer.toString();
    }
}
