package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// (17)Faça um programa que verifique a validade de uma senha fornecida pelo usuário. 
				//A senha é 4531. 
				//O programa deve mostrar uma mensagem de permissão de acesso ou não.
		
				Scanner sc = new Scanner (System.in);
				System.out.print("Digite sua senha: ");
				double senha = sc.nextDouble();
				
			if (senha == 4531) {
				System.out.println("Sua senha está correta =)");
			}
			else { System.out.println("Tente novamente, a senha está errada.");
			}
			

	}

}
