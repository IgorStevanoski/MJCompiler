// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ArrayAssignStatement extends DesignatorStatement {

    private DesignatorList designatorList;
    private Designator designator;

    public ArrayAssignStatement (DesignatorList designatorList, Designator designator) {
        this.designatorList=designatorList;
        if(designatorList!=null) designatorList.setParent(this);
        this.designator=designator;
        if(designator!=null) designator.setParent(this);
    }

    public DesignatorList getDesignatorList() {
        return designatorList;
    }

    public void setDesignatorList(DesignatorList designatorList) {
        this.designatorList=designatorList;
    }

    public Designator getDesignator() {
        return designator;
    }

    public void setDesignator(Designator designator) {
        this.designator=designator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(designatorList!=null) designatorList.accept(visitor);
        if(designator!=null) designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designatorList!=null) designatorList.traverseTopDown(visitor);
        if(designator!=null) designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designatorList!=null) designatorList.traverseBottomUp(visitor);
        if(designator!=null) designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ArrayAssignStatement(\n");

        if(designatorList!=null)
            buffer.append(designatorList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(designator!=null)
            buffer.append(designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ArrayAssignStatement]");
        return buffer.toString();
    }
}
