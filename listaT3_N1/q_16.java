package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(16) Faça um programa que receba dois números. Calcule e mostre:
• A soma dos números pares desse intervalo de números, incluindo os números digitados;
• A multiplicação dos números ímpares desse intervalo de números, incluindo os números digitados.*/
		 
		Scanner sc = new Scanner(System.in);

	        System.out.println("Informe dois números inteiros:");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        int somaPares = 0;
	        int multiplicacaoImpares = 1;

	        for (int i = num1; i <= num2; i++) {
	            if (i % 2 == 0) {
	                somaPares += i;
	            } else {
	                multiplicacaoImpares *= i;
	            }
	        }

	        System.out.println("A soma dos números pares é: " + somaPares);
	        System.out.println("A multiplicação dos números ímpares é: " + multiplicacaoImpares);


	}

}
