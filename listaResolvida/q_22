package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
		 * Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência,
		 *  Calcule e mostre:
		 *  a) o valor, em reais, de cada quilowatt 
		 *  b) o valor, em reais, a ser pago por essa residencia 
		 *  c) o valor, em reais, a ser pago com desconto de 15% */
			
			//Recebendo valores
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite o valor do salário mínimo: ");
			double sal = sc.nextDouble();
			System.out.println("Digite a quantidade de quilowatts: ");
			double qtdKWh = sc.nextDouble();
			
			//Valor por Quilowatt
			double precoKWh = (sal * 0.2);
			System.out.println("O valor, em reais, de cada quilowatt é R$" + precoKWh);
			
			//Valor por Residência
			double kWhResidencia = qtdKWh * precoKWh;
			System.out.println("o valor, em reais, a ser pago por essa residencia é R$" + kWhResidencia);
			
			//Aplicação de Desconto
			double descontoKWh = kWhResidencia - (kWhResidencia * 0.15) ;
			System.out.println("O valor, em reais, a ser pago com desconto é R$" + descontoKWh);
			
			
			
			
			
		
	}

}
