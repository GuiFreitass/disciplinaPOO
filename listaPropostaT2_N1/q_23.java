package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* (23)Faça um programa que receba:

		• o código do produto comprado;
		• a quantidade comprada de um produto.

		Calcule e mostre:
		• o preço unitário do produto comprado seguindo a Tabela I;
		• o preço total da nota;
		• o valor do desconto, seguindo a Tabela II e aplicado sobre o preço total  da nota;
		• o preço final da nota depois do desconto.
		*/
				int codProd, qtdProd;
				double precoTot=0;
				double pcd=0;
				double pFinal=0;
			
				Scanner sc = new Scanner (System.in);
				System.out.print("Digite o código do produto (entre 1 e 40): ");
				codProd = sc.nextInt();
				if (codProd >40) {
					System.out.println("Desculpe, codigo inválido.");
				}
				System.out.print("Digite a quantidade de produto comprado: ");
				qtdProd = sc.nextInt();
				// preço do produto unitario
				if (codProd >= 1 && codProd<=10) {
					System.out.println("O preço do produto é R$10.");
					precoTot=10 * qtdProd;
					System.out.println("O preço da nota é R$" + precoTot);
					}
				if (codProd >=11 && codProd<=20 ) {
					System.out.println("O preço do produto é R$15.");
					precoTot=15 * qtdProd;
					System.out.println("O preço da nota é R$" + precoTot);
					}
				
				if (codProd >=21 && codProd <=30) {
					System.out.println("O preço do produto é R$20.");
					precoTot=20 * qtdProd;
					System.out.println("O preço da nota é R$" + precoTot);
					}
				
				if (codProd >=31 && codProd <=40) {
					System.out.println("O preço do produto é R$30.");
					precoTot=30 * qtdProd;
					System.out.println("O preço da nota é R$" + precoTot);
				}
				
			//Desconto aplicado
				
			if(precoTot <=250) {
				pcd= (precoTot * 0.05);
				System.out.println("O valor do desconto é R$"+ pcd);
				pFinal= precoTot - pcd;
				System.out.println("O preço final é R$"+ pFinal);
			}
			if(precoTot >250 && precoTot <= 500) {
				pcd= (precoTot * 0.1);
				System.out.println("O valor do desconto é R$"+ pcd);
				pFinal= precoTot - pcd;
				System.out.println("O preço final é R$"+ pFinal);
			}
			
			if( precoTot > 500) {
				pcd= (precoTot * 0.15);
				System.out.println("O valor do desconto é R$"+ pcd);
				pFinal= precoTot - pcd;
				System.out.println("O preço final é R$"+ pFinal);
			}
				
				
				
				
				
	}

}
