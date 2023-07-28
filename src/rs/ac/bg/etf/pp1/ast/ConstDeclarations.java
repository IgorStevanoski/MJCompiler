// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarations extends Declaration_part {

    private ConstDeclList constDeclList;

    public ConstDeclarations (ConstDeclList constDeclList) {
        this.constDeclList=constDeclList;
        if(constDeclList!=null) constDeclList.setParent(this);
    }

    public ConstDeclList getConstDeclList() {
        return constDeclList;
    }

    public void setConstDeclList(ConstDeclList constDeclList) {
        this.constDeclList=constDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(constDeclList!=null) constDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constDeclList!=null) constDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constDeclList!=null) constDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarations(\n");

        if(constDeclList!=null)
            buffer.append(constDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarations]");
        return buffer.toString();
    }
}
