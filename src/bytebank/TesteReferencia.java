package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(2321,4832);
		
		Conta segundaConta = primeiraConta;
		
	 
		//System.out.println("Saldo da segunda Conta " +segundaConta.saldo);
	}
}
