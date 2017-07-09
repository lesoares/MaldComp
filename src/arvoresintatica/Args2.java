package arvoresintatica;

import Visitor.Visitor;

public class Args2{
 public Args a;
 
 public Args2(){
	 this.a = null;
 }

 public void accept(Visitor v) {
  v.visit(this);
  
 }

}