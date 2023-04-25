package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(23) Faça um programa que receba o valor de uma dívida e 
		mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros, 
		quantidades de parcelas e valor da parcela.
		Os juros e a quantidade de parcelas seguem a tabela abaixo: */
		
		Scanner sc= new Scanner (System.in);

		System.out.println("Digite o valor inicial da dívida: ");
		double valInicial = sc.nextDouble();
		int numParcela;
		double juros;
		double valJuros;
		double valDivida;
		double valParcela;
		
		for (int i=0; i < 5; i++) {
		
			if(i==0) {
				numParcela = 1;
				juros = 0;
				valJuros = valInicial*juros;
				valDivida = valInicial + (valInicial * juros);
				valParcela = valDivida / numParcela;
				System.out.println("Número de Parcelas: " + numParcela);
				System.out.println("Valor do Juros: " + valJuros);
				System.out.println("Valor da Dívida:  " + valDivida);
				System.out.println("Valor de cada Parcela:  " + valParcela );
			}
		
			if(i==1) {
				numParcela = 3;
				juros = 0.1;
				valJuros = valInicial*juros;
				valDivida = valInicial + (valInicial * juros);
				valParcela = valDivida / numParcela;
				System.out.println("Número de Parcelas: " + numParcela);
				System.out.println("Valor do Juros: " + valJuros);
				System.out.println("Valor da Dívida:  " + valDivida);
				System.out.println("Valor de cada Parcela:  " + valParcela );
			}
		
			
			if(i==2) {
				numParcela = 6;
				juros = 0.15;
				valJuros = valInicial*juros;
				valDivida = valInicial + (valInicial * juros);
				valParcela = valDivida / numParcela;
				System.out.println("Número de Parcelas: " + numParcela);
				System.out.println("Valor do Juros: " + valJuros);
				System.out.println("Valor da Dívida:  " + valDivida);
				System.out.println("Valor de cada Parcela:  " + valParcela );
			}
		
			if(i==3) {
				numParcela = 9; 
				juros = 0.20;
				valJuros = valInicial*juros;
				valDivida = valInicial + (valInicial * juros);
				valParcela = valDivida / numParcela;
				System.out.println("Número de Parcelas: " + numParcela);
				System.out.println("Valor do Juros: " + valJuros);
				System.out.println("Valor da Dívida:  " + valDivida);
				System.out.println("Valor de cada Parcela:  " + valParcela );
			}
		
		
			if(i==4) {
				numParcela=12;
				juros = 0.25;
				valJuros = valInicial*juros;
				valDivida = valInicial + (valInicial * juros);
				valParcela = valDivida / numParcela;
				System.out.println("Número de Parcelas: " + numParcela);
				System.out.println("Valor do Juros: " + valJuros);
				System.out.println("Valor da Dívida:  " + valDivida);
				System.out.println("Valor de cada Parcela:  " + valParcela );
			}
			
		}
		
	
		
	}

}
