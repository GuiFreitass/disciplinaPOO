package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(18) Faça um programa que receba um número inteiro maior que 1 e verifique se o número fornecido é primo ou não. Mostrar mensagem de número primo ou de número não primo. 

		 *Um número é primo quando é divisível apenas pelo número um e por ele mesmo.*/
		Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro maior que 1:");
        int num = sc.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (num <= 1) {
            System.out.println("O número informado não é primo.");
        } else if (primo) {
            System.out.println("O número informado é primo.");
        } else {
            System.out.println("O número informado não é primo.");
        }

	}

}
