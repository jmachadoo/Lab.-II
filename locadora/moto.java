package locadora2;

public class moto {


		String placa;
		double cilindrada;
		String modelo;
		String cor;
		String marca;
	    float preco;
	    int ano;

	    public moto(
				String plac,
				double poten,
				String modelo,
				String cor,
		        String marca,
		        boolean cambio_automatico,
		        int ano) 
		{
			placa=plac;
			this.cilindrada=cilindrada;
			this.modelo=modelo;
			this.cor=cor;
			this.marca=marca;
			this.ano=ano;
		}

	    public float get_preco() {
			return preco;
		}

		public void set_preco( float novopreco) {
			preco=novopreco;
		}

		public void andar() {
			System.out.println("Andando");
		}

		public boolean freio() {
			System.out.println("Freando");
			return true;

		}
		public void correr (int velocidade) {
			System.out.println("Estou correndo "+velocidade+"Km");
		}
		public static void main(String[] args) {

			moto M1 = new moto ("ABC01A2",2.0,"Face","Cinza","Cherry",false,2011);
			moto M2 = new moto ("EFG34H5",5.9,"Jacarei","Branco","Yamaha",true,2022);

			M1.ano=2020;
			M1.cor="preto";
			M1.andar();
			M2.marca="xj6";
			M2.correr(1000);
			M2.freio();


}
}