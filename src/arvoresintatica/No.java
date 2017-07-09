package arvoresintatica;
import java.util.*;
import java_cup.runtime.Symbol;

public class No {
	String nome;
	Symbol terminal;		// symbol.value 
	List<No> filhos = new ArrayList<>();
	
	public No(String nome, Symbol valor) {
		this.nome = nome;
		this.terminal = valor;
	}
	
	public No(String nome) {
		this.nome = nome;
	}
	
	void novoFilho(String n, Symbol t){
		No filho = new No(n, t);
		filhos.add(filho);
	}
	
	void novoFilho(String n){
		No filho = new No(n);
		filhos.add(filho);
	}
	
	void novoFilho(No filho){
		filhos.add(filho);
	}

}
