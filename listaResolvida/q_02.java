package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Faça um programa que receba três notas, calcule e mostre a média aritimetica entre elas.
		
		Scanner sc = new Scanner (System.in);
		double nota1;
		double nota2;
		double nota3;
		
		System.out.println("Digite sua primeira nota");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite sua terceira nota");
		nota3 = sc.nextDouble();
		
		double media1 = ((nota1+ nota2 + nota3)/2 ); 
		System.out.println("Sua media é: " + media1 );

			}
			

	

	}


