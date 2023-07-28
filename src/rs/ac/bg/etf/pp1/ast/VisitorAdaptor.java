// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public abstract class VisitorAdaptor implements Visitor { 

    public void visit(Program program) { }
    public void visit(DesignatorList designatorList) { }
    public void visit(MethodTypeName methodTypeName) { }
    public void visit(Designator designator) { }
    public void visit(ActParamList actParamList) { }
    public void visit(Declaration_list declaration_list) { }
    public void visit(Condition condition) { }
    public void visit(TypeExtended typeExtended) { }
    public void visit(Matched matched) { }
    public void visit(DesignatorStatement designatorStatement) { }
    public void visit(ConstructorDeclarationList constructorDeclarationList) { }
    public void visit(Mulop mulop) { }
    public void visit(Relop relop) { }
    public void visit(CondFact condFact) { }
    public void visit(FormPars formPars) { }
    public void visit(AddopTerm addopTerm) { }
    public void visit(Statement statement) { }
    public void visit(ConstrMethDeclItemList constrMethDeclItemList) { }
    public void visit(ConstDecl constDecl) { }
    public void visit(Addop addop) { }
    public void visit(ParameterList parameterList) { }
    public void visit(ClassDeclItemList classDeclItemList) { }
    public void visit(Term term) { }
    public void visit(DesignatorOpt designatorOpt) { }
    public void visit(ConstrMethDecl constrMethDecl) { }
    public void visit(Assignop assignop) { }
    public void visit(VarDeclList varDeclList) { }
    public void visit(Unmatched unmatched) { }
    public void visit(VarDeclListSemi varDeclListSemi) { }
    public void visit(Parameter parameter) { }
    public void visit(StatementList statementList) { }
    public void visit(ActPars actPars) { }
    public void visit(Expr expr) { }
    public void visit(CondTerm condTerm) { }
    public void visit(MethodDeclarationList methodDeclarationList) { }
    public void visit(Factor factor) { }
    public void visit(VarDecl varDecl) { }
    public void visit(ConstDeclList constDeclList) { }
    public void visit(Declaration_part declaration_part) { }
    public void visit(Label Label) { visit(); }
    public void visit(Module Module) { visit(); }
    public void visit(Divide Divide) { visit(); }
    public void visit(Multiply Multiply) { visit(); }
    public void visit(SUB_Operation SUB_Operation) { visit(); }
    public void visit(Add_Operation Add_Operation) { visit(); }
    public void visit(Rel_Operation_LESSEQU Rel_Operation_LESSEQU) { visit(); }
    public void visit(Rel_Operation_LESS Rel_Operation_LESS) { visit(); }
    public void visit(Rel_Operation_GREATEREQU Rel_Operation_GREATEREQU) { visit(); }
    public void visit(Rel_Operation_GREATER Rel_Operation_GREATER) { visit(); }
    public void visit(Rel_Operation_NOTEQUAL Rel_Operation_NOTEQUAL) { visit(); }
    public void visit(Rel_Operation_EQUAL Rel_Operation_EQUAL) { visit(); }
    public void visit(Assign_Operation Assign_Operation) { visit(); }
    public void visit(Factor_Expr Factor_Expr) { visit(); }
    public void visit(Factor_New_Pars Factor_New_Pars) { visit(); }
    public void visit(Factor_New_Array Factor_New_Array) { visit(); }
    public void visit(Factor_Bool Factor_Bool) { visit(); }
    public void visit(Factor_Character Factor_Character) { visit(); }
    public void visit(Factor_Number Factor_Number) { visit(); }
    public void visit(Factor_Designator_Pars Factor_Designator_Pars) { visit(); }
    public void visit(Factor_Designator Factor_Designator) { visit(); }
    public void visit(Term_Factors Term_Factors) { visit(); }
    public void visit(Term_Factor Term_Factor) { visit(); }
    public void visit(Addop_Term Addop_Term) { visit(); }
    public void visit(Addop_Terms Addop_Terms) { visit(); }
    public void visit(ExprError ExprError) { visit(); }
    public void visit(PositiveExpr PositiveExpr) { visit(); }
    public void visit(NegativeExpr NegativeExpr) { visit(); }
    public void visit(ActParameters ActParameters) { visit(); }
    public void visit(ActParameter ActParameter) { visit(); }
    public void visit(ActParsDerived1 ActParsDerived1) { visit(); }
    public void visit(Actuals Actuals) { visit(); }
    public void visit(DesignatorName DesignatorName) { visit(); }
    public void visit(Designator_THIS Designator_THIS) { visit(); }
    public void visit(Designator_ArrayElem Designator_ArrayElem) { visit(); }
    public void visit(Designator_Dot_Ident Designator_Dot_Ident) { visit(); }
    public void visit(Designator_Ident Designator_Ident) { visit(); }
    public void visit(DesignatorOptionalNone DesignatorOptionalNone) { visit(); }
    public void visit(DesignatorOptional DesignatorOptional) { visit(); }
    public void visit(Designator_Opt Designator_Opt) { visit(); }
    public void visit(Designator_List Designator_List) { visit(); }
    public void visit(ArrayAssignStatement ArrayAssignStatement) { visit(); }
    public void visit(DecStatement DecStatement) { visit(); }
    public void visit(IncStatement IncStatement) { visit(); }
    public void visit(FuncCallStatement FuncCallStatement) { visit(); }
    public void visit(AssignStatement AssignStatement) { visit(); }
    public void visit(Condition_Relop_Expr Condition_Relop_Expr) { visit(); }
    public void visit(Condition_Expr Condition_Expr) { visit(); }
    public void visit(Condition_Facts Condition_Facts) { visit(); }
    public void visit(Condition_Fact Condition_Fact) { visit(); }
    public void visit(Condition_Terms Condition_Terms) { visit(); }
    public void visit(Condition_Term Condition_Term) { visit(); }
    public void visit(ForEach_Statement ForEach_Statement) { visit(); }
    public void visit(StatementList_Statement StatementList_Statement) { visit(); }
    public void visit(Print_NUM_Statement Print_NUM_Statement) { visit(); }
    public void visit(Print_NONUM_Statement Print_NONUM_Statement) { visit(); }
    public void visit(Read_Statement Read_Statement) { visit(); }
    public void visit(Return_NoExpr_Statement Return_NoExpr_Statement) { visit(); }
    public void visit(Return_Expr_Statement Return_Expr_Statement) { visit(); }
    public void visit(Continue_Statement Continue_Statement) { visit(); }
    public void visit(Break_Statement Break_Statement) { visit(); }
    public void visit(While_Statement While_Statement) { visit(); }
    public void visit(Matched_If_Statement Matched_If_Statement) { visit(); }
    public void visit(DesignatorStatement_Statement DesignatorStatement_Statement) { visit(); }
    public void visit(UnmatchedIfElse UnmatchedIfElse) { visit(); }
    public void visit(UnmatchedIf UnmatchedIf) { visit(); }
    public void visit(UnmachedStmt UnmachedStmt) { visit(); }
    public void visit(MatchedStmt MatchedStmt) { visit(); }
    public void visit(StatementListDerived1 StatementListDerived1) { visit(); }
    public void visit(Statements Statements) { visit(); }
    public void visit(ArrayParameter ArrayParameter) { visit(); }
    public void visit(ScalarParameter ScalarParameter) { visit(); }
    public void visit(FormalParameter FormalParameter) { visit(); }
    public void visit(FormalParameters FormalParameters) { visit(); }
    public void visit(FormParsDerived1 FormParsDerived1) { visit(); }
    public void visit(FormParameters FormParameters) { visit(); }
    public void visit(ReturnType ReturnType) { visit(); }
    public void visit(MethodVoidName MethodVoidName) { visit(); }
    public void visit(MethodRetTypeName MethodRetTypeName) { visit(); }
    public void visit(MethodDeclaration MethodDeclaration) { visit(); }
    public void visit(Method Method) { visit(); }
    public void visit(Methods Methods) { visit(); }
    public void visit(ConstructorDeclaration ConstructorDeclaration) { visit(); }
    public void visit(Constructor Constructor) { visit(); }
    public void visit(Constructors Constructors) { visit(); }
    public void visit(ConstrMethDeclItemListDerived1 ConstrMethDeclItemListDerived1) { visit(); }
    public void visit(ConstrMethConstrDeclItem ConstrMethConstrDeclItem) { visit(); }
    public void visit(ConstrMethMethDeclItem ConstrMethMethDeclItem) { visit(); }
    public void visit(ConstrMethBothItems ConstrMethBothItems) { visit(); }
    public void visit(Type Type) { visit(); }
    public void visit(TypeExtendedDerived1 TypeExtendedDerived1) { visit(); }
    public void visit(Type_Extended Type_Extended) { visit(); }
    public void visit(ConstrMeth_Decl ConstrMeth_Decl) { visit(); }
    public void visit(ClassVarItem ClassVarItem) { visit(); }
    public void visit(ClassBothItems ClassBothItems) { visit(); }
    public void visit(ClassDecl ClassDecl) { visit(); }
    public void visit(VarDeclListSemiDerived1 VarDeclListSemiDerived1) { visit(); }
    public void visit(VarDeclList_Semi VarDeclList_Semi) { visit(); }
    public void visit(VarDeclBracket VarDeclBracket) { visit(); }
    public void visit(VarDeclNoBracket VarDeclNoBracket) { visit(); }
    public void visit(VarDecl_Bracket VarDecl_Bracket) { visit(); }
    public void visit(VarDecl_noBracket VarDecl_noBracket) { visit(); }
    public void visit(Var_dec Var_dec) { visit(); }
    public void visit(Var_dec_list Var_dec_list) { visit(); }
    public void visit(ConstDeclBool ConstDeclBool) { visit(); }
    public void visit(ConstDeclChar ConstDeclChar) { visit(); }
    public void visit(ConstDeclNumber ConstDeclNumber) { visit(); }
    public void visit(Const_dec Const_dec) { visit(); }
    public void visit(Const_dec_list Const_dec_list) { visit(); }
    public void visit(ErrorDeclarationSemi ErrorDeclarationSemi) { visit(); }
    public void visit(ErrorDeclarationComma ErrorDeclarationComma) { visit(); }
    public void visit(ClassDeclaration ClassDeclaration) { visit(); }
    public void visit(VarDeclarations VarDeclarations) { visit(); }
    public void visit(ConstDeclarations ConstDeclarations) { visit(); }
    public void visit(Declaration_listDerived1 Declaration_listDerived1) { visit(); }
    public void visit(Declarations Declarations) { visit(); }
    public void visit(ProgName ProgName) { visit(); }
    public void visit(ProgramNoMethods ProgramNoMethods) { visit(); }
    public void visit(ProgramMethods ProgramMethods) { visit(); }


    public void visit() { }
}
