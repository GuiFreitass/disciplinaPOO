package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// q_10	Faça um programa que calcula e mostre uma área de um quadrado. Sabe-se que: A = lado * ladodigitado;
		
		Scanner sc = new Scanner (System.in) ;
	System.out.println("/////////// Calculadora da área do ⬛ ///////////");
	System.out.println(                                   );
	System.out.println("Digite o lado do quadrado:");
	double lado = sc.nextDouble();
	double area = lado * lado;
		System.out.println("A área do ⬛ é: "+ area);
	
	
	
	
	
	}

}
