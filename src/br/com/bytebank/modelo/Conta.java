package br.com.bytebank.modelo;

public class Conta {

	protected double saldo;
	
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
	public void deposita(double valor) {
		this.saldo = this.saldo+valor;
	}
	
	
	public void saca(double valor) throws SaldoInsulficienteException {
		 if(this.saldo<valor) {
			throw new SaldoInsulficienteException("O Saldo :" +this.saldo+", Valor"+ valor);
		 }
		 
		 this.saldo = this.saldo - valor;
			
	}
	
	
	public void transfere(double valor, Conta destino) throws SaldoInsulficienteException{
		saca(valor);
			destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}	