package controller;

import util.Teclado;

public class Questao06 {
	public static void main(String[] args) {
		
		//Exibir textos ao usuario
		System.out.println("DIFERENÇA ENTRE VALORES");
		System.out.println("-----------------------");
		System.out.println("Informe dois números inteiros, conforme for solicitado: \n");
				
		// Solicitar e armazenar dados ao usuario
		int inNumero1 = Teclado.lerInt("Número 1: ");
		int inNumero2 = Teclado.lerInt("Número 2: ");
		
		
		// Criar variaveis condicional Maior
		boolean condMaior  = inNumero1 > inNumero2;
		
		// Cria var com calculo de saída
		// Parte do princípio que InNumero1 é o maior
		int outResultado   = inNumero1 - inNumero2;
		
		// Var texto saída
		// Parte principio que inNumero 1 é maior
		String outMensagem = inNumero1 + " - " + inNumero2 + " = ";
		
		
		// Se (Não for inNumero1 maior que inNumero2){Executar esse boco de código}
		if(!condMaior) {
			// Sobrescrever o calculo em outResultado
			outResultado = inNumero2 - inNumero1;
			// Sobrescrever o texto em outMensagem
			outMensagem  = inNumero2 + " - " + inNumero1 + " = ";
		}
		
		// Exibir Textos de saída
		System.out.println("\n------------------------");
		System.out.println(outMensagem + outResultado);
	}
}
