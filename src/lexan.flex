import java_cup.runtime.*;

%%

%cupdebug
%class Lexer
%line
%column
%cup


%{
    private Symbol Sym(int type) {
        return new Symbol(type, yyline, yycolumn);
  }
  private Symbol Sym(int type, Object value) {
      return new Symbol(type, yyline, yycolumn, value);
  }

%}

FimLinha = \r|\n|\r\n
Char = [^\r\n]
Espaco = {FimLinha} | [ \t\f]
ComentarioLinha = "//" {Char}* {FimLinha}?
ComentarioGeral = "/*" [^*] ~"*/" | "/*" "*"+ "/"
Numero = [-]?[0-9]+
Identificador = [a-zA-Z][a-zA-Z0-9_]*



%%

/* Palavras reservadas */
"if"						     { return new Symbol(Sym.IF);}
"then"						   { return new Symbol(Sym.THEN);}
"else"						   { return new Symbol(Sym.ELSE);}
"def" 						   { return new Symbol(Sym.DEF);}


/* Operadores Aritmeticos */
"+"							   { return new Symbol(Sym.MAIS);}
"-"							   { return new Symbol(Sym.MENOS);}
"*"							   { return new Symbol(Sym.MULT);}
"/"							   { return new Symbol(Sym.DIVISAO);}


/* Operadores de Comparacao */
"<"							   { return new Symbol(Sym.MENOR);}
">"							   { return new Symbol(Sym.MAIOR);}
"=" 						   { return new Symbol(Sym.IGUAL);}

/* Pontuacao */
","						       { return new Symbol(Sym.VIRG); }
";"						       { return new Symbol(Sym.PONTOVIRG); }
"("						       { return new Symbol(Sym.APARENT); }
")"						       { return new Symbol(Sym.FPARENT); }

/* Numeros */
{Numero}			               { return new Symbol(Sym.NUM); }

/* Identificadores */
{Identificador}				               { return new Symbol(Sym.ID); }

/* Comentarios */
{ComentarioGeral}                       { /* Nao faz nada */ }
{ComentarioLinha}			               { /* Nao faz nada */ }

/* Espaco em branco */
{Espaco}                               { /* Nao faz nada */ }


/* Erros */
[^]                                                    { throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + (yyline+1) + ", coluna " +(yycolumn+1)); }
