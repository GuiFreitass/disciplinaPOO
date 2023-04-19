package br.edu.principal;

import java.util.Scanner; 

public class Principal {

		public static void main(String[] args) {
			/*16 Faça um programa que receba o valor dos catetos de um triângulo, 
				* calcule e mostre o valor da hipotenusa. */
						Scanner sc = new Scanner (System.in);
						System.out.println("Digite o valor do primeiro cateto em cm: ");
					    double cateto1 = sc.nextDouble();
					    System.out.println("Digite o valor do segundo cateto em cm: ");
					    double cateto2 = sc.nextDouble();
					    double hipotenusa = Math.sqrt ((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2))) ;  
					    System.out.println("O valor da hipotenusa é " + hipotenusa + "cm");
					    
			}

		}