// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ActParameters extends ActParamList {

    private ActParamList actParamList;
    private Expr expr;

    public ActParameters (ActParamList actParamList, Expr expr) {
        this.actParamList=actParamList;
        if(actParamList!=null) actParamList.setParent(this);
        this.expr=expr;
        if(expr!=null) expr.setParent(this);
    }

    public ActParamList getActParamList() {
        return actParamList;
    }

    public void setActParamList(ActParamList actParamList) {
        this.actParamList=actParamList;
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
        if(actParamList!=null) actParamList.accept(visitor);
        if(expr!=null) expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(actParamList!=null) actParamList.traverseTopDown(visitor);
        if(expr!=null) expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(actParamList!=null) actParamList.traverseBottomUp(visitor);
        if(expr!=null) expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParameters(\n");

        if(actParamList!=null)
            buffer.append(actParamList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(expr!=null)
            buffer.append(expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParameters]");
        return buffer.toString();
    }
}
