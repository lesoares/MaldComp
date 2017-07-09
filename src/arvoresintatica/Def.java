package arvoresintatica;

import Visitor.Visitor;

public class Def{
	public Args a;
	public Expressao e;
	public String id;
	
	public Def(String i, Args a, Expressao e){
		this.a = a;
		this.e = e;
		this.id = i;
		
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
