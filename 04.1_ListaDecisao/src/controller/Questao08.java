package controller;

import util.Teclado;

public class Questao08 {
	
	public static void main(String[] args) {
		
		//Exibir textos ao usuario
		System.out.println("NÚMERO ENTRE 0 E 10");
		System.out.println("-----------------------");
		System.out.println("Informe um número inteiro, para saber se está na faixa entre 1 e 10: \n");
				
		// Solicitar e armazenar dados ao usuario
		int inNumero = Teclado.lerInt("Número: ");
		
		// Variaveis com as condicionais
		boolean condFaixaInicial = inNumero > 0;
		boolean condFaixaFinal   = inNumero < 11;
		boolean condFaixas       = condFaixaInicial && condFaixaFinal;
		
		// Var texto saída
		// Parte do principio que todo numero está dentro da faixa
		String outMensagem = "NÚMERO: " +  inNumero + " | Dentro da Faixa | Entre 1 e 10";
		
		
		// Se (NÃO ESTIVER ENTRE 1 e 11) {executar esse bloco de codigo}
		if(!condFaixas) {
			//Se (NÃO FOR MAIOR QUE 0){executar esse bloco de codigo}
			if(!condFaixaInicial) {
				//Sobrescrever o valor de OutMensagem
				outMensagem = "NÚMERO: " +  inNumero + " | Fora da Faixa | Menor que 1";
			}
			//Se (NÃO FOR MENOR QUE 11){executar esse bloco de codigo}
			else
			{
				//Sobrescrever o valor de OutMensagem
				outMensagem = "NÚMERO: " +  inNumero + " | Fora da Faixa | Maior que 10";
			}
		}
		
		System.out.println(outMensagem);
		
		
	}

}
