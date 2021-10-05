package bytebank;

public class Conta {

	private double saldo;
	
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
	
	
	public boolean saca(double valor) {
		 if(this.saldo >=valor) {
			 this.saldo = this.saldo - valor;
			 return true;
		 }else {
			 return false;
		 }
	}
	
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >=valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}	