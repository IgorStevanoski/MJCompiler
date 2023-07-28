// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Const_dec extends ConstDeclList {

    private Type type;
    private ConstDecl constDecl;

    public Const_dec (Type type, ConstDecl constDecl) {
        this.type=type;
        if(type!=null) type.setParent(this);
        this.constDecl=constDecl;
        if(constDecl!=null) constDecl.setParent(this);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }

    public ConstDecl getConstDecl() {
        return constDecl;
    }

    public void setConstDecl(ConstDecl constDecl) {
        this.constDecl=constDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(type!=null) type.accept(visitor);
        if(constDecl!=null) constDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(type!=null) type.traverseTopDown(visitor);
        if(constDecl!=null) constDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(type!=null) type.traverseBottomUp(visitor);
        if(constDecl!=null) constDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Const_dec(\n");

        if(type!=null)
            buffer.append(type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(constDecl!=null)
            buffer.append(constDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Const_dec]");
        return buffer.toString();
    }
}
