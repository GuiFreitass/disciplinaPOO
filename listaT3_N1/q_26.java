package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
	/*(26) Faça um programa que determine e mostre os cinco primeiros múltiplos
	 *  de 3, considerando números > 0.*/
	
		System.out.println("Esse programa determina os cinco primeiros múltiplos de 3, sendo estes: ");
		
		int qtd = 0;
		int num = 0;
		
		while (qtd < 5) {
			if ((num%3)==0) {
				System.out.print(num);
				if (qtd < 4) {
                    System.out.print("-");
                }
				qtd += 1;
			}
			num += 1; 
		}
	}
}
