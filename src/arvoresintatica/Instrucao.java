package arvoresintatica;

import Visitor.Visitor;

public class Instrucao extends Programa{
	public Def d;
	public Instrucao i;
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
