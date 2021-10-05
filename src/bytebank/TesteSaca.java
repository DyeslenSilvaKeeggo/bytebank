package bytebank;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(382,3212);
				conta.deposita(321);
				conta.saca(34);
				System.out.println(conta.getSaldo());
	}
}
