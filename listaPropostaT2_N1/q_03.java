package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//(3) Faça um programa que receba dois números e mostre menor.
		Scanner sc = new Scanner (System.in) ;
		System.out.println("*** Digite dois números para descobrir o menor. ***");
		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		if(num1< num2) {
			System.out.println("O número "+ num1+ "é o menor número.");
		}
		if(num1> num2) {
			System.out.println("O número "+ num2+ " é o menor número.");
		}
	}

}
