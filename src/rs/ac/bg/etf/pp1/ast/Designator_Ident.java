// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Designator_Ident extends Designator {

    private DesignatorName designatorName;

    public Designator_Ident (DesignatorName designatorName) {
        this.designatorName=designatorName;
        if(designatorName!=null) designatorName.setParent(this);
    }

    public DesignatorName getDesignatorName() {
        return designatorName;
    }

    public void setDesignatorName(DesignatorName designatorName) {
        this.designatorName=designatorName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(designatorName!=null) designatorName.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designatorName!=null) designatorName.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designatorName!=null) designatorName.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator_Ident(\n");

        if(designatorName!=null)
            buffer.append(designatorName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator_Ident]");
        return buffer.toString();
    }
}
