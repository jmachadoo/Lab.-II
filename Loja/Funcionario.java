package Loja;

public class Funcionario{
	String nome;
	int idade;
	String função; 


public Funcionario(	String nom,int idad,String fun)

{
	nome=nom;
	idade=idad;
	this.função=fun;
}

public double get_idade() {
	return idade;
}

public void set_idade( int novaidade) {
	idade=novaidade;
}

public void informar_dados() {

	System.out.println(função + "\n"+ idade +"\n" + nome);
}

public void atender (int trabalhando) {
	System.out.println("Estou atendendo");
}
public static void main(String[] args) {

	Funcionario F1 = new Funcionario ("joao",21,"atendente");
	Funcionario F2 = new Funcionario ("gabriel",23,"faxineiro");


	F1.informar_dados();

	F2.informar_dados();}
}