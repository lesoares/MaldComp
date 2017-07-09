package arvoresintatica;

import Visitor.Visitor;

public class Instrucao{
	public Def d;
	public Instrucao i;
	
	public Instrucao(Def d, Instrucao i){
		this.d = d;
		this.i = i;
		
	}

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
