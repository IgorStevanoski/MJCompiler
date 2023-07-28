// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Const_dec_list extends ConstDeclList {

    private ConstDeclList constDeclList;
    private ConstDecl constDecl;

    public Const_dec_list (ConstDeclList constDeclList, ConstDecl constDecl) {
        this.constDeclList=constDeclList;
        if(constDeclList!=null) constDeclList.setParent(this);
        this.constDecl=constDecl;
        if(constDecl!=null) constDecl.setParent(this);
    }

    public ConstDeclList getConstDeclList() {
        return constDeclList;
    }

    public void setConstDeclList(ConstDeclList constDeclList) {
        this.constDeclList=constDeclList;
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
        if(constDeclList!=null) constDeclList.accept(visitor);
        if(constDecl!=null) constDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constDeclList!=null) constDeclList.traverseTopDown(visitor);
        if(constDecl!=null) constDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constDeclList!=null) constDeclList.traverseBottomUp(visitor);
        if(constDecl!=null) constDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Const_dec_list(\n");

        if(constDeclList!=null)
            buffer.append(constDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(constDecl!=null)
            buffer.append(constDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Const_dec_list]");
        return buffer.toString();
    }
}
