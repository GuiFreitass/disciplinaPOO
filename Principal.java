package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Fa�a um programa que recebe quatro n�meros inteiros, calcule e mostre a soma desses n�meros.
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int num4 = sc.nextInt();
		
		int somaDosNumeros = (num1 + num2+ num3+ num4);
		System.out.println("A soma dos n�meros " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + somaDosNumeros );
				
	}

}
 