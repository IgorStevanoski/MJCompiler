// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Actuals extends ActPars {

    private ActParamList actParamList;

    public Actuals (ActParamList actParamList) {
        this.actParamList=actParamList;
        if(actParamList!=null) actParamList.setParent(this);
    }

    public ActParamList getActParamList() {
        return actParamList;
    }

    public void setActParamList(ActParamList actParamList) {
        this.actParamList=actParamList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(actParamList!=null) actParamList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(actParamList!=null) actParamList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(actParamList!=null) actParamList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Actuals(\n");

        if(actParamList!=null)
            buffer.append(actParamList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Actuals]");
        return buffer.toString();
    }
}
