# MicroJava Compiler
Goal of the project was to make a compiler for MikroJava, a Java-like programming language with reduced set of
instructions, using Java.  Project is divided into 4 parts: lexical analysis, syntax analysis, semantic analysis and code generator.  
**Lexical analysis** is executed by lexer, which processes input file, dividing it into smaller units (tokens) which make job of paresr easier.  
**Syntax analysis** is executed by parser, which takes the token sequence, given by lexer, and checks wheter it is according to the language grammar. 
It produces abstract syntax tree, which is forwarded to semantic analyzer.  
**Semantic analysis** is executed by syntax analyzer, which checks wheter the code is according to semantics of language, based on the given abstract semantic tree.  
**Code generation** is executed at the end for a syntactically and semantically correct code. Product of this stage is an object file which can be 
executed on MicroJava virtual machine.  
### Use of tools and program launch
Project is build using build.xml file, which contains scripts for generating individual parts. Lexer is automatically generated using jflex tool, 
which requires written specification for lexical analysis in form of .jflex file (mjflexer.flex).
Parser is automatically generated using jcup tool, which requires written specification for syntax analysis in form of .cup file (mjparser.cup).
After that, syntactically correct program is forwarded to semantic analysis (SemanticAnalyzer.java) and at the very end to code generation
(CodeGenerator.java) using runobj target in build.xml file.  
Wheter the solution is syntactically and semantically correct is tested by launching main method of class Compiler.java, which produces object file.
Content of object file can be checked with "disasm" option of build.xml file or by running runObj option.
