// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class MethodRetTypeName extends MethodTypeName {

    private ReturnType returnType;
    private String methName;

    public MethodRetTypeName (ReturnType returnType, String methName) {
        this.returnType=returnType;
        if(returnType!=null) returnType.setParent(this);
        this.methName=methName;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType=returnType;
    }

    public String getMethName() {
        return methName;
    }

    public void setMethName(String methName) {
        this.methName=methName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(returnType!=null) returnType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(returnType!=null) returnType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(returnType!=null) returnType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodRetTypeName(\n");

        if(returnType!=null)
            buffer.append(returnType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+methName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodRetTypeName]");
        return buffer.toString();
    }
}
