// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class While_Statement extends Matched {

    private Condition condition;
    private Matched matched;

    public While_Statement (Condition condition, Matched matched) {
        this.condition=condition;
        if(condition!=null) condition.setParent(this);
        this.matched=matched;
        if(matched!=null) matched.setParent(this);
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition=condition;
    }

    public Matched getMatched() {
        return matched;
    }

    public void setMatched(Matched matched) {
        this.matched=matched;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(condition!=null) condition.accept(visitor);
        if(matched!=null) matched.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(condition!=null) condition.traverseTopDown(visitor);
        if(matched!=null) matched.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(condition!=null) condition.traverseBottomUp(visitor);
        if(matched!=null) matched.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("While_Statement(\n");

        if(condition!=null)
            buffer.append(condition.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(matched!=null)
            buffer.append(matched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [While_Statement]");
        return buffer.toString();
    }
}
