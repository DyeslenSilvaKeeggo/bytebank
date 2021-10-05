package bytebank;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(232, 3213);	
		contaCorrente.deposita(212.82);
		ContaPoupanca contaPoupanca = new ContaPoupanca(4342,4323);
		contaPoupanca.deposita(3782);
		
		contaCorrente.transfere(323, contaPoupanca);
		
		System.out.println("CC " +contaCorrente.getSaldo());
		System.out.println("CP " +contaPoupanca.getSaldo());
	}
}