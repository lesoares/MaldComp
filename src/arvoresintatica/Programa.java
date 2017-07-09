package arvoresintatica;
import Visitor.*;

public class Programa extends Prog1{

	Programa p;
	String id;
	int num;
	
	public Programa(String str, int i, Programa p2){
		this.p = p2;
		this.id = str;
		this.num = i;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
}
