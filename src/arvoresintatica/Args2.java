package arvoresintatica;

import Visitor.Visitor;

public class Args2 extends Prog1{
 public Args a;
 
 @Override
 public void accept(Visitor v) {
  v.visit(this);
  
 }

}