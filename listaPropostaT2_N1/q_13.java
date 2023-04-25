package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// (13) Faça um programa que receba o preço de um produto, 
				//calcule e mostre, de acordo com a tabela a seguir, o novo preço e a classificação
				Scanner sc = new Scanner (System.in) ;
				double newPreco = 0;
				System.out.print("Informe o valor do produto: R$");
				double preco = sc.nextDouble();
				//Percentual de aumento
				if (preco<= 50) {
					 newPreco = preco + (preco*0.05);
				}
				if ( 50 < preco && preco <= 100) {
					 newPreco = preco + (preco*0.1);
					}
				if (preco>100) {
					 newPreco = preco + (preco*0.15);
					}
				System.out.println("O valor do produto ficou R$" + newPreco);
				//Classificações dos valores
				if (newPreco<=80) {
					System.out.println("O valor do produto é barato.");
				}
				if (newPreco>80 && newPreco <= 120) {
					System.out.println("O valor do produto é normal.");
				}
				
				if (newPreco>120 && newPreco <= 200) {
					System.out.println("O valor do produto é caro.");
				}
				if ( newPreco > 200) {
					System.out.println("O valor do produto é muito caro.");
				}

	}

}
