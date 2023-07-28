// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclaration extends Declaration_part {

    private ClassDecl classDecl;

    public ClassDeclaration (ClassDecl classDecl) {
        this.classDecl=classDecl;
        if(classDecl!=null) classDecl.setParent(this);
    }

    public ClassDecl getClassDecl() {
        return classDecl;
    }

    public void setClassDecl(ClassDecl classDecl) {
        this.classDecl=classDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(classDecl!=null) classDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(classDecl!=null) classDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(classDecl!=null) classDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclaration(\n");

        if(classDecl!=null)
            buffer.append(classDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclaration]");
        return buffer.toString();
    }
}
