package br.eedu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//(14) Faça um programa que receba um salário de um funcionário, calcule e mostre o novo salário desse funcionário de bonificação e de auxílio-escola.

		double sal, novoSal ;
		double boni = 0;
		double auxi= 0;
		Scanner sc = new Scanner (System.in);
		System.out.print( "Digite o seu salário: ");
		sal= sc.nextDouble();

		if (sal <= 500) {
		boni= sal * 0.05;
		}

		if (sal > 500 && sal<=1200) {
		boni= sal*0.12;

		}

		if (sal> 1200) {
		boni= 0;
		}

		if (sal <= 600) {
		auxi= 150;
		}

		if ( sal > 600) {
		auxi=100;

		}

		novoSal = (sal + boni + auxi);
		System.out.println("A bonificação é de: "+ boni);
		System.out.println("O auxilio é de: "+ auxi);
		System.out.println("O novo salário é: "+ novoSal);

	
	}

}
