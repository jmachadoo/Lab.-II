package Loja;

public class Funcionario{
	private String nome;
	private int idade;
	private String funcao; 
	private String situacao;

public Funcionario(	String nom,int idad,String fun)

{
	nome=nom;
	idade=idad;
	this.funcao=fun;
	
}

public String getSituacao() {
	return situacao;
}

public void setSituacao(String situacao) {
	this.situacao = situacao;
}

public int get_idade() {
	return idade;
}

public void set_idade( int novaidade) {
	idade=novaidade;
}

public String getfuncao() {
	return funcao;
}

public void set_funcao(String funcao) {
	this.funcao = funcao;
}

public void informar_dados() {

	System.out.println(funcao + "\n"+ idade +"\n" + nome);
}

public void atender (int trabalhando) {
	System.out.println("Estou atendendo");
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public static void main(String[] args) {

	Funcionario F1 = new Funcionario ("joao",21,"atendente");
	Funcionario F2 = new Funcionario ("gabriel",23,"faxineiro");
    F1.set_idade(25);
    System.out.println(F1.get_idade());

	F1.informar_dados();

	F2.informar_dados();
	}
}