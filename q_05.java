package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* (05) Faça um programa que receba três numeros obrigatoriamente em ordem crescente e um quarto número que não siga esta regra. 
		Mostre, em seguida, os quatro números em ordem decrescente.*/

		Scanner sc = new Scanner (System.in);
		double num1;
		double num2;
		double num3;
		double num4;
		
		System.out.println("Digite três números em ordem crescente.");
		System.out.println("Digite o primeiro número: ");
			num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
			num2 = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
			num3 = sc.nextDouble();
		System.out.println("Digite um número fora de ordem: ");
			num4 = sc.nextDouble();
			
		if (num4 > num3) {
			System.out.println("A ordem decrescente é: " + num4 + ", " + num3 + ", " + num2 + ", " + num1 + " .");
		}

		if (num4 > num2  && num4 < num3) {
			System.out.println("A ordem decescente é: " + num3 + ", " + num4 + ", " + num2 + ", " + num1 + " .");
		}


		if (num4>num1 && num4<num2){
			System.out.println("A ordem decescente é: " + num3 + ", " + num2 + ", " + num4 + ", " + num1 + " .");
		}


		if (num4<num1) {
			System.out.println("A ordem decescente é: " + num3 + ", " + num2 + ", " + num1 + ", " + num4 + " .");
	}


	}

}
