package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Faça um programa que receba uma hora formada por hora e minutos (um número real), calcule e mostre a hora digitada apenas em minutos. 
		*Lembre-se de que: para quatro e meia deve-se digitar 4.30. Os minutos vão de 0 a 60. */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite uma hora: ");
		double hora = sc.nextDouble();
		int horaInt = (int) hora;
		double minutos = (hora - horaInt);
		double horaEmMin = (horaInt*60) + (minutos*100);
		System.out.println("O horário em minutos é: " + horaEmMin);

	}

}
