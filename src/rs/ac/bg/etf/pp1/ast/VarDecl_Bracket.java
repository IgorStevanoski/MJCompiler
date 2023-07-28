// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class VarDecl_Bracket extends VarDecl {

    private VarDeclBracket varDeclBracket;

    public VarDecl_Bracket (VarDeclBracket varDeclBracket) {
        this.varDeclBracket=varDeclBracket;
        if(varDeclBracket!=null) varDeclBracket.setParent(this);
    }

    public VarDeclBracket getVarDeclBracket() {
        return varDeclBracket;
    }

    public void setVarDeclBracket(VarDeclBracket varDeclBracket) {
        this.varDeclBracket=varDeclBracket;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclBracket!=null) varDeclBracket.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclBracket!=null) varDeclBracket.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclBracket!=null) varDeclBracket.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDecl_Bracket(\n");

        if(varDeclBracket!=null)
            buffer.append(varDeclBracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDecl_Bracket]");
        return buffer.toString();
    }
}
