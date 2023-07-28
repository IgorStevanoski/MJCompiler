// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Constructor extends ConstructorDeclarationList {

    private ConstructorDeclaration constructorDeclaration;

    public Constructor (ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration=constructorDeclaration;
        if(constructorDeclaration!=null) constructorDeclaration.setParent(this);
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration=constructorDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(constructorDeclaration!=null) constructorDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constructorDeclaration!=null) constructorDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constructorDeclaration!=null) constructorDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Constructor(\n");

        if(constructorDeclaration!=null)
            buffer.append(constructorDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Constructor]");
        return buffer.toString();
    }
}
