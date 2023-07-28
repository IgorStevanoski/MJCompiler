// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ProgramMethods extends Program {

    private ProgName progName;
    private Declaration_list declaration_list;
    private MethodDeclarationList methodDeclarationList;

    public ProgramMethods (ProgName progName, Declaration_list declaration_list, MethodDeclarationList methodDeclarationList) {
        this.progName=progName;
        if(progName!=null) progName.setParent(this);
        this.declaration_list=declaration_list;
        if(declaration_list!=null) declaration_list.setParent(this);
        this.methodDeclarationList=methodDeclarationList;
        if(methodDeclarationList!=null) methodDeclarationList.setParent(this);
    }

    public ProgName getProgName() {
        return progName;
    }

    public void setProgName(ProgName progName) {
        this.progName=progName;
    }

    public Declaration_list getDeclaration_list() {
        return declaration_list;
    }

    public void setDeclaration_list(Declaration_list declaration_list) {
        this.declaration_list=declaration_list;
    }

    public MethodDeclarationList getMethodDeclarationList() {
        return methodDeclarationList;
    }

    public void setMethodDeclarationList(MethodDeclarationList methodDeclarationList) {
        this.methodDeclarationList=methodDeclarationList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(progName!=null) progName.accept(visitor);
        if(declaration_list!=null) declaration_list.accept(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(progName!=null) progName.traverseTopDown(visitor);
        if(declaration_list!=null) declaration_list.traverseTopDown(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(progName!=null) progName.traverseBottomUp(visitor);
        if(declaration_list!=null) declaration_list.traverseBottomUp(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ProgramMethods(\n");

        if(progName!=null)
            buffer.append(progName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(declaration_list!=null)
            buffer.append(declaration_list.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(methodDeclarationList!=null)
            buffer.append(methodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ProgramMethods]");
        return buffer.toString();
    }
}
