package arvoresintatica;

import Visitor.Visitor;

public class Args{
 public Args2 a2;
 public String id;
 
 public Args(String i, Args2 args2) {
  this.id = i;
  this.a2 = args2;
 }
 
 public void accept(Visitor v) {
  v.visit(this);
  
 }

}