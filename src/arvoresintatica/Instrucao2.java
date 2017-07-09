package arvoresintatica;

import Visitor.Visitor;

public class Instrucao2{
	public Instrucao i;
	
	public Instrucao2(){
		this.i = null;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
