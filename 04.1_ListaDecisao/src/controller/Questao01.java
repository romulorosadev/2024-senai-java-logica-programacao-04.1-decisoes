package controller;

import util.Teclado;

public class Questao01 {
	public static void main(String[] args) {
		
		double inNum = Teclado.lerDouble("Informe um número: ");
		
		if(inNum > 20) {
			double outRes = inNum/2;
			System.out.println(outRes);
		} else {
			System.out.println(inNum);
		}	
	}

}
