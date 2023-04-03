package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// q_09	Faça um programa que calcula e mostre a área de um trapézio. Sabe-se que: A = ((base maior + base menor) * altura)/2
		Scanner sc = new Scanner (System.in) ;
	System.out.println("Digite a base maior do trapézio:");
		double bMaior = sc.nextDouble();
		System.out.println("Digite a base menor do trapézio:");
		double bMenor = sc.nextDouble();
		System.out.println("Digite a altura do trapézio:");
		double altura = sc.nextDouble();
	double area= ((bMaior + bMenor)* altura) /2 ;
	System.out.println("A área do trapézio é = "+ area );
	
	
	
	
	
	}

}
