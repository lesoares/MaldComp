package arvoresintatica;

import Visitor.Visitor;

public class Expressao2 extends Prog1{
 public Sequencia s;
 
 @Override
 public void accept(Visitor v) {
  v.visit(this);
  
 }

}