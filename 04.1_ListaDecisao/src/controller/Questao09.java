package controller;

import util.Teclado;

public class Questao09 {
	public static void main(String[] args) {
		//Exibir textos ao usuario
		System.out.println("POSITIVO, NEGATIVO OU NULO?");
		System.out.println("-----------------------");
		System.out.println("Informe um número, para processarmos seu status: \n");
				
		// Solicitar e armazenar dados ao usuario
		int inNumero = Teclado.lerInt("Número: ");
		
		//Var verificar status do numero
		boolean isPositivo  = inNumero > 0;
		boolean isNegativo  = inNumero < 0;
		
		//Var armazenar/manipular textos saída
		String outStatus;
		
		// Se (Positivo)
		if (isPositivo) 
		{
			// Atribuir esse texto ao valor da var
			outStatus = " | Positivo";
		} 
		// Se (Negativo)
		else if (isNegativo) 
		{
			// Atribuir esse texto ao valor da var
			outStatus = " | Negativo";
		} 
		// Se nao
		else 
		{
			// Atribuir esse texto ao valor da var
			outStatus = " | Neutro";	
		}
		
		//Exibir mensagem de saída
		System.out.println("\n-----------------\n");
		System.out.println("NÚMERO: " + inNumero + outStatus);	
	}

}
