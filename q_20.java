package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*( 20) Faça um programa que receba:
		*• O código de um produto comprado, supondo que a digitação do código do produto seja sempre válida, ou seja, um número inteiro entre 1 e 10;
		*• O peso do produto em quilos;
		*• O código do país de origem, supondo que a digitação do código do país seja sempre válida, ou seja, um número inteiro entre 1 e 3 */

		Scanner sc = new Scanner (System.in);
		int codProd,codPais;			
		double pesoKG, pesoG, precoTot,  valTotal ;
		double precoG = 0.0;
		double imposto = 0.0;
		
		System.out.print("Digite o código do país entre 1 a 3:");
		codPais = sc.nextInt();
		
		System.out.print("Digite o código do produto entre 1 a 10:");
		codProd = sc.nextInt();
		
		System.out.print("Digite o peso do produto em quilos: ");
		  pesoKG =  sc.nextDouble();
		  pesoG= pesoKG* 1000;
		  System.out.println("O produto têm: " +pesoG+ " gramas.");
		  
		  if (codProd >=1 && codProd <=4) {
			  precoG = 10; 
			  
		  }
		  if (codProd >=5 && codProd <=7) {
			  precoG = 25; 
		  }
		  if (codProd >=8 && codProd <=10) {
			  precoG = 35; 
		  }
		  
		  precoTot = pesoG * precoG;
		  System.out.println("O preço total é: "+ precoTot);
		 
		  if (codPais == 1 ) {
			  imposto = 0;
		  }
		  if (codPais == 2 ) {
			  imposto = precoTot * 0.15;
		  }
		  if (codPais == 3 ) {
			  imposto = precoTot * 0.25;
			 
		  }

		  System.out.println("O imposto é de: " + imposto);
		  valTotal = precoTot + imposto;
		  
		  System.out.println("O valor total é de: " + valTotal);

	}

}
