// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class PositiveExpr extends Expr {

    private AddopTerm addopTerm;

    public PositiveExpr (AddopTerm addopTerm) {
        this.addopTerm=addopTerm;
        if(addopTerm!=null) addopTerm.setParent(this);
    }

    public AddopTerm getAddopTerm() {
        return addopTerm;
    }

    public void setAddopTerm(AddopTerm addopTerm) {
        this.addopTerm=addopTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(addopTerm!=null) addopTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(addopTerm!=null) addopTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(addopTerm!=null) addopTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("PositiveExpr(\n");

        if(addopTerm!=null)
            buffer.append(addopTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PositiveExpr]");
        return buffer.toString();
    }
}
