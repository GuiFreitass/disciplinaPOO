package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* (21) Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras a seguir: 
		 * a) a hora trabalhada vale 1/8 do salário mínimo; 
		 * b) a hora extra vale 1/4 do salário mínimo: ;
		 * c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada; 
		 * d) a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra:
		   e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras. */
		Scanner sc =  new Scanner (System.in);
		System.out.println("Coloque as horas trabalhadas: ");
		int horasTrab = sc.nextInt();
		
		System.out.println("Coloque seu salário: ");
		double sal = sc.nextInt();
		
		System.out.println("Coloque suas horas extras trabalhadas: ");
		int horaExtra = sc.nextInt();
		
		double valHorasTrab = (sal *  0.125) * horasTrab;
		
		double valHoraExtra = (sal *0.25) * horaExtra ;
      
		double salBruto = (horasTrab * valHorasTrab) + sal ;
	
		double extraBruto = (horaExtra * valHoraExtra);
		 
		 double seuSalario = (salBruto + extraBruto );
		System.out.println("Seu salário total é = " + seuSalario);
	}

}
