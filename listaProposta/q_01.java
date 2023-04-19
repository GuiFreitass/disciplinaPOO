package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//q_01	Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.
		Scanner sc = new Scanner (System.in) ;
		
	System.out.println("####################### subtração de dois numeros #######################");
	System.out.println(                                        );
		System.out.println("Digite o primeiro número para a subtração:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número para a subtração:");
		int num2= sc.nextInt();
		int resultado = (num1-num2);
	System.out.println("O resultado é = " + resultado);
	
	
	
	
	
	}

}
