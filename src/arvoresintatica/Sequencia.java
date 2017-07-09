package arvoresintatica;

import Visitor.Visitor;

public class Sequencia extends Prog1{
 public Sequencia s;
 public Expressao e;
 
 @Override
 public void accept(Visitor v) {
  v.visit(this);
  
 }

}