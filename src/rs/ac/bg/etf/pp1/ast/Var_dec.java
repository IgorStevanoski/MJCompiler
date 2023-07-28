// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Var_dec extends VarDeclList {

    private Type type;
    private VarDecl varDecl;

    public Var_dec (Type type, VarDecl varDecl) {
        this.type=type;
        if(type!=null) type.setParent(this);
        this.varDecl=varDecl;
        if(varDecl!=null) varDecl.setParent(this);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
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
        if(type!=null) type.accept(visitor);
        if(varDecl!=null) varDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(type!=null) type.traverseTopDown(visitor);
        if(varDecl!=null) varDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(type!=null) type.traverseBottomUp(visitor);
        if(varDecl!=null) varDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Var_dec(\n");

        if(type!=null)
            buffer.append(type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(varDecl!=null)
            buffer.append(varDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Var_dec]");
        return buffer.toString();
    }
}
