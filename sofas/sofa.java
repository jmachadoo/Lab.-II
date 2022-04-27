public class Sofa {
	Double preco;
	String cor;
	Integer lugares;

	public String exibir() {
		return "----------\n" + "Preco: " + this.preco + "\n" + "Cor: " + this.cor + "\n" + "Lugares: " + this.lugares
				+ "\n----------";
	}

	public static void main(String[] args) {

		Sofa S1 = new Sofa();

		S1.preco = 1696.4;
		S1.cor = "cinza";
		S1.lugares = 4;

		S2.preco = 1449.0;
		S2.cor = "bege";
		S2.lugares = 4;

		S3.preco = 1199.0;
		S3.cor = "marrom";
		S3.lugares = 4;

		S4.preco = 542.0;
		S4.cor = "cinza";
		S4.lugares = 3;

		System.out.println(S1.exibir());
		System.out.println(S2.exibir());
		System.out.println(S3.exibir());
		System.out.println(S4.exibir());

	}
}
