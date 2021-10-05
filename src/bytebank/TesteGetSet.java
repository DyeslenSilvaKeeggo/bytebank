package bytebank;

public class TesteGetSet {
		public static void main(String[] args) {
			Conta conta = new Conta(3213,4324);
			conta.setAgencia(2322);
			System.out.println(conta.getAgencia());
		}
}
