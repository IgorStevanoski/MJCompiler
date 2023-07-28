// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class StatementList_Statement extends Matched {

    private StatementList statementList;

    public StatementList_Statement (StatementList statementList) {
        this.statementList=statementList;
        if(statementList!=null) statementList.setParent(this);
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList=statementList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(statementList!=null) statementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(statementList!=null) statementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(statementList!=null) statementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementList_Statement(\n");

        if(statementList!=null)
            buffer.append(statementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementList_Statement]");
        return buffer.toString();
    }
}
