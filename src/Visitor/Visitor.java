package Visitor;
import arvoresintatica.*;

public interface Visitor {
	public void visit(Programa p);
	public void visit(Instrucao i);
	public void visit(Def d);
	public void visit(Instrucao2 i);
	public void visit(Expressao e);
	public void visit(Expressao2 e);
	public void visit(Args a);
	public void visit(Args2 a);
	public void visit(Sequencia s);
}
