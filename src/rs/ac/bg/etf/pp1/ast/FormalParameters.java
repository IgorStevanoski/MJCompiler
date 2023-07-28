// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class FormalParameters extends ParameterList {

    private ParameterList parameterList;
    private Parameter parameter;

    public FormalParameters (ParameterList parameterList, Parameter parameter) {
        this.parameterList=parameterList;
        if(parameterList!=null) parameterList.setParent(this);
        this.parameter=parameter;
        if(parameter!=null) parameter.setParent(this);
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList=parameterList;
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
        if(parameterList!=null) parameterList.accept(visitor);
        if(parameter!=null) parameter.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(parameterList!=null) parameterList.traverseTopDown(visitor);
        if(parameter!=null) parameter.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(parameterList!=null) parameterList.traverseBottomUp(visitor);
        if(parameter!=null) parameter.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParameters(\n");

        if(parameterList!=null)
            buffer.append(parameterList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(parameter!=null)
            buffer.append(parameter.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParameters]");
        return buffer.toString();
    }
}
