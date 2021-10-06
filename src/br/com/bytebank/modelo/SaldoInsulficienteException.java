package br.com.bytebank.modelo;

public class SaldoInsulficienteException extends Exception {

	public SaldoInsulficienteException(String msg) {
		super(msg);
	}
}
