// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Factor_New_Pars extends Factor {

    private Type type;
    private ActPars actPars;

    public Factor_New_Pars (Type type, ActPars actPars) {
        this.type=type;
        if(type!=null) type.setParent(this);
        this.actPars=actPars;
        if(actPars!=null) actPars.setParent(this);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }

    public ActPars getActPars() {
        return actPars;
    }

    public void setActPars(ActPars actPars) {
        this.actPars=actPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(type!=null) type.accept(visitor);
        if(actPars!=null) actPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(type!=null) type.traverseTopDown(visitor);
        if(actPars!=null) actPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(type!=null) type.traverseBottomUp(visitor);
        if(actPars!=null) actPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Factor_New_Pars(\n");

        if(type!=null)
            buffer.append(type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(actPars!=null)
            buffer.append(actPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Factor_New_Pars]");
        return buffer.toString();
    }
}
