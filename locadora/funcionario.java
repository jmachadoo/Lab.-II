package locadora2;

public class funcionario{
	String nome;
	int idade;
	String fun��o; 


public funcionario(	String nom,int idad,String fun)

{
	nome=nom;
	idade=idad;
	this.fun��o=fun;
}

public double get_idade() {
	return idade;
}

public void set_idade( int novaidade) {
	idade=novaidade;
}

public void informar_dados() {

	System.out.println(fun��o + "\n"+ idade +"\n" + nome);
}

public void atender (int trabalhando) {
	System.out.println("Estou atendendo");
}
public static void main(String[] args) {

	funcionario F1 = new funcionario ("joao",21,"atendente");
	funcionario F2 = new funcionario ("gabriel",23,"faxineiro");


	F1.informar_dados();

	F2.informar_dados();}
}