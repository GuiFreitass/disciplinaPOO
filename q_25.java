package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*( 25 )Faça um programa que receba uma hora uma variável para hora e outra para minutos, calcule e mostre:
		 *  a) a hora digitada convertida em minutos; 
		 *  b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior.
		 *  c) o total dos minutos convertidos em segundos. */
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Digite a hora: ");
		int hora = sc.nextInt();
		
		System.out.println("Digite os minutos: ");
		int min = sc.nextInt();
		
		int horaEmMin = hora*60;
		System.out.println("A hora total em minutos é: " + horaEmMin);
		
		int totalMin= horaEmMin + min  ;
		System.out.println(" O total de minutos é: "+ totalMin);
		
		int segundos = totalMin * 60 ;
		System.out.println("Os segundos são: "+ segundos);		
		
		
				}

	}