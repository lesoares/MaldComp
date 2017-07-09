package arvoresintatica;

import Visitor.Visitor;

public class Instrucao2 extends Programa{
	public Instrucao i;
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
