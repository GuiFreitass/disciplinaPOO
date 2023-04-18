package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo. Calcule e mostre o salário a receber seguindo as regras abaixo: 
				a) a hora trabalhada vale a metade do salário mínimo; 
				b) o salário bruto equivalente ao número de horas trabalhadas multiplicando pelo valor da hora trabalhada; 
				c) o imposto equivalente a 3% do salário bruto; 
				d) o salário a receber equivalente ao salário bruto menos o imposto. */
			Scanner sc = new Scanner (System.in) ;
		    System.out.println ("Digite o salário minimo: ");
		    double sal = sc.nextFloat() ;
		    System.out.println ("Digite o numero de horas trabalhadas por dia:  ");
		    double horasTrab = sc.nextDouble() ;
		    double valorHorasTrab = sal /2 ;
		    double salBruto = (horasTrab * valorHorasTrab) ;
		    double imposto = salBruto * (0.03) ;
		    double salLiquid = salBruto - imposto ;
		    System.out.println("O seu salário liquido é: " + salLiquid);

	}

}
