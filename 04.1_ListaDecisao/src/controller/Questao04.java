package controller;

import util.Teclado;

public class Questao04 {
	public static void main(String[] args) {
		
		// Solicitar entrada de dados ao usuário no formato inteiro
		int inNum = Teclado.lerInt("Digite um número inteiro: ");
		
		// Variaveis com as condicionais
		boolean condDiv4 = inNum % 4 == 0;
		boolean condDiv5 = inNum % 5 == 0;
		boolean condDivisiveis = condDiv4 && condDiv5;
		
		// Variavel pra armazenar/manipular mensagem de saida
		// Parte do princípio que o número será divisivel por 4 e 5
		String outMensagem = " : Divisível por 4 e 5.";
		
		//Se (NÃO FOR Divisivel por 4 e 5){executar esse bloco de codigo}
		if (!condDivisiveis) {
			// Sobrescreve o valor de texto inserido inicialmente em outMensagem
			outMensagem = " : Não é Divisível por 4 e 5.";
		} 
		
		// Exibir mensagem de saída
		System.out.println("----------------------");
		System.out.println(inNum + outMensagem);
	}
}
