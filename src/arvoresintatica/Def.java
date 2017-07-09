package arvoresintatica;

import Visitor.Visitor;

public class Def extends Programa{
	public Args a;
	public Expressao e;
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
