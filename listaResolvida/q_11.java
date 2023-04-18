package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Faça um programa que receba um número positivo e maior que zero, calcule e mostre: 
			a) o número digitado ao quadrado; 
			b) o número digitado ao cubo; 
			c) a raiz quadrada do número digitado; 
			d) a raiz cúbica do número digitado; */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Calculadora de x², x³, √x, ³√x");
		System.out.println ("Digite um valor positivo e maior que zero para obter os resultados: ");
		int num = sc.nextInt();
		int quad = (num*num);
		int cubo = (int) Math.pow(num, 3);
		double raiz = (double) (Math.sqrt (num));
		double raizCubica = (double) (Math.cbrt(num));
		
		System.out.println("O numero digitado foi: " + num);
		System.out.println("O quadrado de " + num + " é: " + quad);
		System.out.println("O cubo de " + num + " é: " + cubo);
		System.out.println("A raiz quadrada de " + num + " é: " + raiz);
		System.out.println("A raiz cubica de  " + num + " é: " + raizCubica );
	}

}


