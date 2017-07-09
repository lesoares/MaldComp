package arvoresintatica;

import Visitor.Visitor;

public class Expressao extends Prog1{
 public Expressao e1;
 public Expressao e2;
 public Expressao e3;
 public Expressao e4;
 public Expressao2 e2_1;
 
 @Override
 public void accept(Visitor v) {
  v.visit(this);
  
 }
}