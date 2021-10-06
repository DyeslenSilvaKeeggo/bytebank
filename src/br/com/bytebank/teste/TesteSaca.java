package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsulficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(382,3212);
				conta.deposita(321);
				try {
					conta.saca(330);
				} catch (SaldoInsulficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(conta.getSaldo());
	}
}
