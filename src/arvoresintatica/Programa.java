package arvoresintatica;
import visitor.*;

public class Programa {

	Programa p;
	String id;
	int num;
	
	public Programa(String str, int i, Object p2){
		this.p = (Programa) p2;
		this.id = str;
		this.num = i;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
}
