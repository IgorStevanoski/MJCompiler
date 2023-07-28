// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class FormalParameter extends ParameterList {

    private Parameter parameter;

    public FormalParameter (Parameter parameter) {
        this.parameter=parameter;
        if(parameter!=null) parameter.setParent(this);
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter=parameter;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(parameter!=null) parameter.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(parameter!=null) parameter.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(parameter!=null) parameter.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParameter(\n");

        if(parameter!=null)
            buffer.append(parameter.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParameter]");
        return buffer.toString();
    }
}
