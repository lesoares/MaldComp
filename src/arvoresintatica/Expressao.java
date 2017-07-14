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
	public Expressao(Object e2, int opr, Object e3, Object e4, Object e5) {
		this.e2 = (Expressao) e2;
		this.e3 = (Expressao) e3;
		this.e4 = (Expressao) e4;
		this.e5 = (Expressao) e5;
		this.opr = opr;
		this.tipo = 1;
		
		switch (this.opr) {
			case 0 :
				if (this.e2.valor < this.e3.valor)
					this.valor = this.e4.valor;
				else
					this.valor = this.e5.valor;
				break;
			case 1 :
				if (this.e2.valor > this.e3.valor)
					this.valor = this.e4.valor;
				else
					this.valor = this.e5.valor;
				break;
			case 2 :
				if (this.e2.valor == this.e3.valor)
					this.valor = this.e4.valor;
				else
					this.valor = this.e5.valor;
				break;
		}
	}
	
	//Tipo 2 : atr = e2, opr, e3
	public Expressao(Object e2, int opArit, Object e3){
		this.e2 = (Expressao) e2;
		this.opr = opArit;
		this.e3 = (Expressao) e3;
		this.tipo = 2;
		
		switch (this.opr){
			case 0 :
				this.valor = this.e2.valor + this.e3.valor;
				break;
			case 1 :
				this.valor = this.e2.valor - this.e3.valor;
				break;
			case 3: 
				this.valor = this.e2.valor * this.e3.valor;
				break;
			case 4:
				this.valor = this.e2.valor / this.e3.valor;
		}
	}
	
	//Tipo 3 : atr = id, e2_1
	public Expressao(String str, Object seq){
		this.id = str;
		this.seq = (Sequencia) seq;
		this.tipo = 3;
	}
	
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}