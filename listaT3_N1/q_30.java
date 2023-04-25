package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(30) Faça um programa que leia um conjunto não determinado de valores,
		 *  um de cada vez,e escreva uma tabela com cabeçalho, que deve ser 
		 *  repetido a cada 20 linhas. 
		 *  A tabela deverá conter o valor lido, seu quadrado, seu cubo e 
		 *  sua raiz quadrada.Finalizar a entrada de dados com um valor negatico ou 
		 *  zero.*/
		
		int contador;
		double num, quad, cubo, raiz;
		
		
		
		//Receber dados
		Scanner sc = new Scanner (System.in);
		System.out.println("*Insira \"0\" ou um número negativo para cancelar o recebimento de dados.");
		System.out.println("Digite um número: ");
		num = sc.nextDouble();


		contador = 1;
		
		//Encerrar recebimento de dados
		if (num<= 0) {
			System.out.println("Recebimento de dados encerrado.");
			
		}
		
		if (num > 0) //Cabeçalho da tabela
		System.out.println("|VALOR|     |QUADRADO|      |CUBO|      |RAIZ|");
			
		
		while (num > 0) {
			
			//Cálculo dos valores
			quad = Math.pow(num, 2);
			cubo = Math.pow(num, 3);
			raiz = Math.sqrt(num);
			
			
			//Criar tabela
			if (contador < 20) {
				
				System.out.print("|");
				System.out.print(num);
				System.out.print("  |     |  ");
				System.out.print(quad);
				System.out.print("  |     |  ");
				System.out.print(cubo);
				System.out.print("  |     |  ");
				System.out.print(raiz);
				System.out.println("|  ");
				contador += 1;
				
			}else{ //SE a quantidade de linhas chegar a 20.
				
				contador = 0; //Zera o contador de linhas
				
				//Imprime o cabeçalho novamente
				System.out.println("|VALOR|     |QUADRADO|      |CUBO|      |RAIZ|");
				contador += 1; 
				System.out.print("|");
				System.out.print(num);
				System.out.print("  |     |  ");
				System.out.print(quad);
				System.out.print("  |     |  ");
				System.out.print(cubo);
				System.out.print("  |     |  ");
				System.out.print(raiz);
				System.out.println("|  ");
				}
			
			System.out.println("Digite um número: ");
			num = sc.nextDouble();
			
			
		}
System.out.println("Recebimento de dados encerrado.");
			
	}
}
			
		
			

