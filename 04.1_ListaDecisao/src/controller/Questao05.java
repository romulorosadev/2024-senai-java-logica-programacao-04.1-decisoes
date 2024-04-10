package controller;

import util.Teclado;

public class Questao05 {
	public static void main(String[] args) {
		
		//Exibir textos ao usuario
		System.out.println("NOTAS ESCOLARES");
		System.out.println("-----------------------");
		System.out.println("Informe 4 notas, conforme for solicitado: \n");
		
		// Solicitar e armazenar dados ao usuario
		double inNota1 = Teclado.lerDouble("Nota 1: ");
		double inNota2 = Teclado.lerDouble("Nota 2: ");
		double inNota3 = Teclado.lerDouble("Nota 3: ");
		double inNota4 = Teclado.lerDouble("Nota 4: ");
		
		// Var pra armazenar/manipular o valor do processamento dos dados informados pelo usuario
		double outMedia = (inNota1 + inNota2 + inNota3 + inNota4)/4;
		
		// Var para armazenar/manipular a condicional
		boolean condAprovado = outMedia >= 5;
		
		// Var para armazenar/manipular o texto a ser exibido
		// Parte do principio que o aluno esta aprovado
		String outMensagem = "APROVADO!";
		
		// SE (NÃO FOR MÉDÁ >= 5) {executar esse bloco de código}
		if(!condAprovado){
			// Sobrescrever o valor anteriormente inserido em OutMensasgem com esse novo valor.
			outMensagem = "REPROVADO.";
		}
		
		// Exibir texto de saída
		System.out.println("\n------------------------------");
		System.out.println("MÉDIA: " + outMedia + " | ALUNO: " + outMensagem);
	}
}
