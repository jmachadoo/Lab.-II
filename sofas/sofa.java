package sofas;

public class sofa {
	Float preco;
	String cor;
	Float lugares;
	

	public sofa(
			float preco,
			String cor,
			Float lugares)
			
{		
		

		this.preco=preco;
		this.cor= cor;
		this.lugares=lugares;
		
}

	public float get_preco() {
		return preco;
	}
		
		public float get_lugares(float lugares) {
			return lugares;
		}
		
		public static void main(String[] args) {

			
			sofa S1 = new sofa ( "  " );
			sofa S2 = new sofa ( "  " );
			sofa S3 = new sofa ( "  " );
			sofa S4 = new sofa ( "  " );
			
			S1.preco ();
			S1.cor ();
			S1.lugares();
			
			S2.preco (1449);
			S2.cor (bege);
			S2.lugares(4);
			
			S3.preco (1199);
			S3.cor (marrom);
			S3.lugares(4);
			
			S4.preco (542);
			S4.cor (cinza);
			S4.lugares(3);
			
}
}
