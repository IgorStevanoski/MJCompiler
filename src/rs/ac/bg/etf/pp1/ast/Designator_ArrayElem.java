// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Designator_ArrayElem extends Designator {

    private DesignatorName designatorName;
    private Expr expr;

    public Designator_ArrayElem (DesignatorName designatorName, Expr expr) {
        this.designatorName=designatorName;
        if(designatorName!=null) designatorName.setParent(this);
        this.expr=expr;
        if(expr!=null) expr.setParent(this);
    }

    public DesignatorName getDesignatorName() {
        return designatorName;
    }

    public void setDesignatorName(DesignatorName designatorName) {
        this.designatorName=designatorName;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr=expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(designatorName!=null) designatorName.accept(visitor);
        if(expr!=null) expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designatorName!=null) designatorName.traverseTopDown(visitor);
        if(expr!=null) expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designatorName!=null) designatorName.traverseBottomUp(visitor);
        if(expr!=null) expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator_ArrayElem(\n");

        if(designatorName!=null)
            buffer.append(designatorName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(expr!=null)
            buffer.append(expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator_ArrayElem]");
        return buffer.toString();
    }
}
