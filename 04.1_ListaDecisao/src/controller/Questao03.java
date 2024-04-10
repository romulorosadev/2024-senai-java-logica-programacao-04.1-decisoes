package controller;

import util.Teclado;

public class Questao03 {
	public static void main(String[] args) {
		
		// Solicitar entrada de dados ao usuário no formato int
		int inNum = Teclado.lerInt("Poderia informar um número?");
		
		// Variavel com a condicional
		boolean condPar = inNum % 2 == 0;

		// Variavel pra manipular mensagem de saída inserindo o texto abaixo
		String outMensagem = " é Par";
		
		// Se (NÃO FOR PAR) {Executar esse bloco de texto}
		if (!condPar) {
			// Atribuir o valor desse texto a var outMensagem
			outMensagem = " é Ímpar";
		} 
		
		// Exibir mensagem de saída
		System.out.println("_________________\n");
		System.out.println(inNum + outMensagem);
	}
}
