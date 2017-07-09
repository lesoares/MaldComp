package arvoresintatica;

import Visitor.Visitor;

public class Sequencia{
	public Sequencia s;
	public Expressao e;
	
	public Sequencia(Sequencia seq, Expressao exp) {
		this.s = seq;
		this.e = exp;
	}
	

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}