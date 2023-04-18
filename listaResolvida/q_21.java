package br.edu.principal;

import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {
		/* (21) faça um programa para calcular e mostrar a que distância deve estar uma escada da parede. 
		O usuário deve fornecer o tamanho da escada e a altura em que deseja pregar o quadro. */
				Scanner sc = new Scanner (System.in) ;
				System.out.println("Digite o tamanho da sua escada: ");
			    double tamEscada = sc.nextDouble() ;
			    System.out.println("Digite a altura que deseja pregar o quadro: ");
			    double altura = sc.nextDouble() ;
			    double distancia = Math.sqrt ((tamEscada * tamEscada) + (altura * altura)) ;  
			    System.out.println("A distancia que a escada deve está é de: " + distancia);
			    
	}

}
