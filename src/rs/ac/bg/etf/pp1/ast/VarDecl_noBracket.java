// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class VarDecl_noBracket extends VarDecl {

    private VarDeclNoBracket varDeclNoBracket;

    public VarDecl_noBracket (VarDeclNoBracket varDeclNoBracket) {
        this.varDeclNoBracket=varDeclNoBracket;
        if(varDeclNoBracket!=null) varDeclNoBracket.setParent(this);
    }

    public VarDeclNoBracket getVarDeclNoBracket() {
        return varDeclNoBracket;
    }

    public void setVarDeclNoBracket(VarDeclNoBracket varDeclNoBracket) {
        this.varDeclNoBracket=varDeclNoBracket;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclNoBracket!=null) varDeclNoBracket.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclNoBracket!=null) varDeclNoBracket.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclNoBracket!=null) varDeclNoBracket.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDecl_noBracket(\n");

        if(varDeclNoBracket!=null)
            buffer.append(varDeclNoBracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDecl_noBracket]");
        return buffer.toString();
    }
}
