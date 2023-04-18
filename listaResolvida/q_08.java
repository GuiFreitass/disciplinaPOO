package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		/* Faça um programa que receba o valor de um depósito e o valor da taxa de juros, 
		 * calcule e mostre o valor do rendimento e o valor total depois do rendimento.*/

		Scanner sc = new Scanner(System.in);
		Double deposito;
		Double juros;
		
		System.out.println("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros(em decimal): ");
		juros = sc.nextDouble();
		
		Double rendimento = (deposito * juros);
		System.out.println("O rendimento é de R$" + rendimento);
		
		Double total = (rendimento + deposito);
		System.out.println("O valor total após o rendimento é R$" + total);}
	}


