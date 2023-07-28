// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Designator_Opt extends DesignatorList {

    private DesignatorOpt designatorOpt;

    public Designator_Opt (DesignatorOpt designatorOpt) {
        this.designatorOpt=designatorOpt;
        if(designatorOpt!=null) designatorOpt.setParent(this);
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
        if(designatorOpt!=null) designatorOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(designatorOpt!=null) designatorOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(designatorOpt!=null) designatorOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator_Opt(\n");

        if(designatorOpt!=null)
            buffer.append(designatorOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator_Opt]");
        return buffer.toString();
    }
}
