package arvoresintatica;

import visitor.*;

public class Sequencia{
	public Sequencia s;
	public Expressao e;
	
	public Sequencia(Object seq, Object exp) {
		this.s = (Sequencia) seq;
		this.e = (Expressao) exp;
	}
	

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}