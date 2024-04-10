package controller;

import util.Teclado;

public class Questao07 {
	public static void main(String[] args) {
		
		//Exibir textos ao usuario
		System.out.println("MÓDULO DO NÚMERO");
		System.out.println("-----------------------");
		System.out.println("Informe um número inteiro positivo ou negativo, para processarmos o seu módulo: \n");
				
		// Solicitar e armazenar dados ao usuario
		int inNumero = Teclado.lerInt("Número: ");
		
		
		//Var verificar se o numero é positivo
		boolean isPositivo = inNumero >= 0;
		
		// Var saida val de modulo
		// Parte do principio que todos são numeros positivos
		int outModulo = inNumero;
		
		
		//Se (NÃO FOR NUMERO POSITIVO) {executar esse bloco de código}	
		if(!isPositivo) {
			
			// Sobrescrever o valor de módulo com uma operação
			outModulo = inNumero - inNumero * 2;
		}
		
		//Exibir infos de saída
		System.out.println("\n-----------------");
		System.out.println("NÚMERO: " + inNumero);
		System.out.println("MÓDULO: " + outModulo);
	}

}
