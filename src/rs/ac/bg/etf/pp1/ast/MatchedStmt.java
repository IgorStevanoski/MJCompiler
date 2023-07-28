// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class MatchedStmt extends Statement {

    private Matched matched;

    public MatchedStmt (Matched matched) {
        this.matched=matched;
        if(matched!=null) matched.setParent(this);
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
        if(matched!=null) matched.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(matched!=null) matched.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(matched!=null) matched.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedStmt(\n");

        if(matched!=null)
            buffer.append(matched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedStmt]");
        return buffer.toString();
    }
}
