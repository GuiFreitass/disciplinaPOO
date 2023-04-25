package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* 6. Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.*/
		
		Scanner sc= new Scanner(System.in);
		int num, resto;
		System.out.println("*** Descubra se um número é par ou ímpar ***");
		System.out.println("Digite um número: ");
			num = sc.nextInt();
			resto = num%2;
			if(resto == 0) {
				System.out.println("O número " + num + " é par.");
			}else {
				System.out.println("O número " + num + " é ímpar.");
			}
	}

}
 
