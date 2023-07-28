// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Print_NUM_Statement extends Matched {

    private Expr expr;
    private Integer N2;

    public Print_NUM_Statement (Expr expr, Integer N2) {
        this.expr=expr;
        if(expr!=null) expr.setParent(this);
        this.N2=N2;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr=expr;
    }

    public Integer getN2() {
        return N2;
    }

    public void setN2(Integer N2) {
        this.N2=N2;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(expr!=null) expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(expr!=null) expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(expr!=null) expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Print_NUM_Statement(\n");

        if(expr!=null)
            buffer.append(expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+N2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Print_NUM_Statement]");
        return buffer.toString();
    }
}
