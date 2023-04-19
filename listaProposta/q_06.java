package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// q_06	Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo de um funcionário 
		//e o valor de suas vendas, calcule e mostre a comissão e o salário final do funcionário.
	Scanner sc = new Scanner (System.in) ;
	System.out.println("####### Como calcular seu salário final e sua comissão das vendas #######");
	System.out.println(                                              );
	System.out.println("Digite o valor do seu salario:");
	double sal = sc.nextDouble();
	System.out.println("Digite o valor de suas vendas:");
	double vendas = sc.nextDouble();
	double comissao = (vendas * 0.04) ;
	double salFinal = (comissao + sal);
	System.out.println("A sua comissão é: " + comissao );
	System.out.println("O seu salário final é: " + salFinal );
	
}

}
