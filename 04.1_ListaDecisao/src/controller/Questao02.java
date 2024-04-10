package controller;

import util.Teclado;

public class Questao02 {
	
	public static void main(String[] args) {
		
		// Var pra armazenar/manipular dado do usuario no formato string
		//.toUpperCase() - Método que transforma o texto em caixa alta
		String inCapital = Teclado.lerTexto
		("Informe a Capital do Brasil: " ).toUpperCase();
		
		// Var pra armazenar/manipular a condicional
		boolean condCapital = inCapital.equals("BRASÍLIA") || inCapital.equals("BRASILIA");
		
		
		// Var pra armazenar/manipular mensagem de saída  
		// Parte do princípío que o usuário vai informar a cidade certa
		String outMensagem = " : Resposta Certa";
		
		// Se (NÃO FOR IGUAL a BRASÍLIA ou BRASILIA) {executar esse bloco de codigo}
		if (!condCapital) {
			
			// Sobrescreve o valor de texto inserido inicialmente em outMensagem
			outMensagem = " : Resposta Errada";
		}
		
		// Exibir texto de saída
		System.out.println("----------------------");
		System.out.println(inCapital + outMensagem);
	}

}
