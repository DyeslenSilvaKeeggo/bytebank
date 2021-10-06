package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SaldoInsulficienteException;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(232, 3213);	
		contaCorrente.deposita(212.82);
		ContaPoupanca contaPoupanca = new ContaPoupanca(4342,4323);
		contaPoupanca.deposita(3782);
		
		try {
			contaCorrente.transfere(323, contaPoupanca);
		} catch (SaldoInsulficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("CC " +contaCorrente.getSaldo());
		System.out.println("CP " +contaPoupanca.getSaldo());
	}
}