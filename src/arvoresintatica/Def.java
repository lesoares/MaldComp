package arvoresintatica;

import visitor.*;

public class Def{
	public Args a;
	public Expressao e;
	public String id;
	
	public Def(String i, Object a, Object e){
		this.a = (Args) a;
		this.e = (Expressao) e;
		this.id = i;
		
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
