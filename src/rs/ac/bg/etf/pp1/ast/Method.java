// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Method extends MethodDeclarationList {

    private MethodDeclaration methodDeclaration;

    public Method (MethodDeclaration methodDeclaration) {
        this.methodDeclaration=methodDeclaration;
        if(methodDeclaration!=null) methodDeclaration.setParent(this);
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration=methodDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(methodDeclaration!=null) methodDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(methodDeclaration!=null) methodDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(methodDeclaration!=null) methodDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Method(\n");

        if(methodDeclaration!=null)
            buffer.append(methodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Method]");
        return buffer.toString();
    }
}
