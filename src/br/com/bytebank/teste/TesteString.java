package br.com.bytebank.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";
		String outra = nome.replace("A", "a");
		System.out.println(outra);	
		char r =nome.charAt(2);
		int pos = nome.indexOf("lur");
		System.out.println(pos);
		System.out.println(r);
	}
}