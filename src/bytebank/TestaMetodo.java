package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta01 = new Conta(1321,302);
		boolean conseguiuRetirar = conta01.saca(20);
		System.out.println(conseguiuRetirar);
		
		
		Conta conta02 = new Conta(1443,2382);
		conta02.transfere(499, conta01);
			
//		
//		conta01.titular = "Dyeslen Silva";
//		System.out.println(conta01.titular);
	}

}
