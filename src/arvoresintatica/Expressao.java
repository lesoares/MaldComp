package arvoresintatica;

import visitor.*;

public class Expressao {
	public Expressao e2;
	public Expressao e3;
	public Expressao e4;
	public Expressao e5;
	public String id;
	public Sequencia seq;
	public int valor;
	public int opr;
	public int tipo;
	
	
	//Tipo 1 : atr = e2,opr, e3, e4, e5
	public Expressao(Expressao e2, int opr, Expressao e3, Expressao e4, Expressao e5) {
		this.e2 = e2;
		this.e3 = e3;
		this.e4 = e4;
		this.e5 = e5;
		this.opr = opr;
		this.tipo = 1;
		
		switch (this.opr) {
			case 0 :
				if (e2.valor < e3.valor)
					this.valor = e4.valor;
				else
					this.valor = e5.valor;
				break;
			case 1 :
				if (e2.valor > e3.valor)
					this.valor = e4.valor;
				else
					this.valor = e5.valor;
				break;
			case 2 :
				if (e2.valor == e3.valor)
					this.valor = e4.valor;
				else
					this.valor = e5.valor;
				break;
		}
	}
	
	//Tipo 2 : atr = e2, opr, e3
	public Expressao(Expressao e2, int opArit, Expressao e3){
		this.e2 = e2;
		this.opr = opArit;
		this.e3 = e3;
		this.tipo = 2;
		
		switch (this.opr){
			case 0 :
				this.valor = e2.valor + e3.valor;
				break;
			case 1 :
				this.valor = e2.valor - e3.valor;
				break;
			case 3: 
				this.valor = e2.valor * e3.valor;
				break;
			case 4:
				this.valor = e2.valor / e3.valor;
		}
	}
	
	//Tipo 3 : atr = id, e2_1
	public Expressao(String str, Sequencia seq){
		this.id = str;
		this.seq = seq;
		this.tipo = 3;
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}