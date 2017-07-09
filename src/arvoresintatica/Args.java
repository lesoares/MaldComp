package arvoresintatica;

import Visitor.Visitor;

public class Args extends Prog1{
 public Args2 a2;
 
 @Override
 public void accept(Visitor v) {
  v.visit(this);
  
 }
}