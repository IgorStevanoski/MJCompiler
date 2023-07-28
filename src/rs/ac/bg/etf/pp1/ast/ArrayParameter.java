// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ArrayParameter extends Parameter {

    private Type type;
    private String paramName;

    public ArrayParameter (Type type, String paramName) {
        this.type=type;
        if(type!=null) type.setParent(this);
        this.paramName=paramName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName=paramName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(type!=null) type.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(type!=null) type.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(type!=null) type.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ArrayParameter(\n");

        if(type!=null)
            buffer.append(type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+paramName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ArrayParameter]");
        return buffer.toString();
    }
}
