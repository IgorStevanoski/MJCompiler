// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class FormParameters extends FormPars {

    private ParameterList parameterList;

    public FormParameters (ParameterList parameterList) {
        this.parameterList=parameterList;
        if(parameterList!=null) parameterList.setParent(this);
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList=parameterList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(parameterList!=null) parameterList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(parameterList!=null) parameterList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(parameterList!=null) parameterList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParameters(\n");

        if(parameterList!=null)
            buffer.append(parameterList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParameters]");
        return buffer.toString();
    }
}
