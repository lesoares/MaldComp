package arvoresintatica;

import visitor.*;

public class Args{
 public Args a2;
 public String id;
 
 public Args(String i, Object a2) {
  this.id = i;
  this.a2 = (Args) a2;
 }
 
 public void accept(Visitor v) {
  v.visit(this);
  
 }

}