// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Designator_List extends DesignatorList {

    private DesignatorList designatorList;
    private DesignatorOpt designatorOpt;

    public Designator_List (DesignatorList designatorList, DesignatorOpt designatorOpt) {
        this.designatorList=designatorList;
        if(designatorList!=null) designatorList.setParent(this);
        this.designatorOpt=designatorOpt;
        if(designatorOpt!=null) designatorOpt.setParent(this);
    }

    public DesignatorList getDesignatorList() {
        return designatorList;
    }

    public void setDesignatorList(DesignatorList designatorList) {
        this.designatorList=designatorList;
    }

    public DesignatorOpt getDesignatorOpt() {
        return designatorOpt;
    }

    public void setDesignatorOpt(DesignatorOpt designatorOpt) {
        this.designatorOpt=designatorOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(designatorList!=null) designatorList.accept(visitor);
        if(designatorOpt!=null) designatorOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designatorList!=null) designatorList.traverseTopDown(visitor);
        if(designatorOpt!=null) designatorOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designatorList!=null) designatorList.traverseBottomUp(visitor);
        if(designatorOpt!=null) designatorOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator_List(\n");

        if(designatorList!=null)
            buffer.append(designatorList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(designatorOpt!=null)
            buffer.append(designatorOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator_List]");
        return buffer.toString();
    }
}
