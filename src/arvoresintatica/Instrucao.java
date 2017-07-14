package arvoresintatica;

import visitor.*;

public class Instrucao{
	public Def d;
	public Instrucao i;
	
	public Instrucao(Object d, Object i){
		this.d = (Def) d;
		this.i = (Instrucao) i;
		
	}
	
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
