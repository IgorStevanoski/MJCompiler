// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Factor_Designator extends Factor {

    private Designator designator;

    public Factor_Designator (Designator designator) {
        this.designator=designator;
        if(designator!=null) designator.setParent(this);
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
        if(designator!=null) designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designator!=null) designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designator!=null) designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Factor_Designator(\n");

        if(designator!=null)
            buffer.append(designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Factor_Designator]");
        return buffer.toString();
    }
}
