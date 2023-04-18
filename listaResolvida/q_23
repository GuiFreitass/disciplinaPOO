package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* (23)	Faça um programa que receba um número real, calcule e mostre: 
		* a) a parte inteira desse número: 
		* b) a parte fracionária desse número: 
		* c) o arredondamento desse número. */
			
				Scanner sc = new Scanner (System.in) ;
				System.out.println("Digite um numero real:");
				double real = sc.nextDouble() ;
				System.out.println("O número que foi digitado é: "+ real);
				//parte infeira
				int inteiro= (int) real;
				System.out.println("A parte inteira desse número é: " + inteiro);
				//parte fracionada (OBS: nao bote numeros tão quebrados)
				double fracionada = (real - inteiro) ;
				System.out.println( "A parte fracionada desse número é: " +fracionada);
				//numero arredondado
				double arredondar = Math.rint(real);
				System.out.println("O numero arredondada do numero é: " + arredondar);

	}

}
