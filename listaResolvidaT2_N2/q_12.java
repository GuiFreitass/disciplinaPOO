package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(12) Faça um programa que receba o código ao cardo do um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. 
		 * Os cargos estão na tabela a seguir. */
		
		Scanner sc = new Scanner (System.in);
		double sal, aumento, novoSal;
		
		System.out.println("Os cargos são:  1 - Escriturário, 2- Secretário, 3-  Caixa, 4- Gerente, 5- Diretor");
		System.out.print("Informe um cargo: ");
		double cargo =  sc.nextDouble();
		
		System.out.print("Digite o valor do salário: ");
		sal= sc.nextDouble();
		
		if (cargo == 1) {
			System.out.println("O cargo é escriturário.");
			aumento= (sal* 1/2);	
			System.out.println("O valor do aumento é: " + aumento);
			novoSal= sal+ aumento;
			System.out.println("O novo salário é:" + novoSal);
		}
		if (cargo == 2) {
			System.out.println("O cargo é secretário.");
			aumento= (sal* 0.35);	
			System.out.println("O valor do aumento é: " + aumento);
			novoSal= sal+ aumento;
			System.out.println("O novo salário é:" + novoSal);
		
		}
		if (cargo == 3) {
			System.out.println("O cargo é caixa.");
			aumento= (sal* 0.20);	
			System.out.println("O valor do aumento é: " + aumento);
			novoSal= sal+ aumento;
			System.out.println("O novo salário é:" + novoSal);
		}
		
		if (cargo == 4) {
			System.out.println("O cargo é gerente.");
			aumento= (sal* 0.1);	
			System.out.println("O valor do aumento é: " + aumento);
			novoSal= sal+ aumento;
			System.out.println("O novo salário é:" + novoSal);
		}
		if (cargo == 5) {
			System.out.println("O cargo é diretor.");
			aumento= (sal* 0/100);	
			System.out.println("O valor do aumento é: " + aumento);
			novoSal= sal+ aumento;
			System.out.println("O novo salário é:" + novoSal);
		}
		else {
			System.out.println("Não encontramos um cargo.");
		}
	}

}
