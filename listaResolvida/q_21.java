package br.edu.principal;

import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {
		/* (21) faça um programa para calcular e mostrar a que distância deve estar uma escada da parede. 
		O usuário deve fornecer o tamanho da escada e a altura em que deseja pregar o quadro. */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite, em centímetros, o tamanho da escada: ");
		double tamEscada = sc.nextDouble();
		
		System.out.println("Digite, em centímetros, a altura que se deseja pendurar o quadro: ");
		double altura = sc.nextDouble();
		
		double distancia = Math.sqrt ((tamEscada * tamEscada) + (altura * altura)); 
		
		System.out.println("A distância entre a escada e a parede deve ser de " + distancia + "cm.");
			    
	}

}
