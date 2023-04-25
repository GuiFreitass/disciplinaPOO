package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(36) Faça um programa que:
• leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo. A última linha, que não entrará nos cálculos, contém o valor da idade igual a zero;
• calcule e mostre a idade média desse grupo de indivíduos.
*/
	
	 Scanner sc = new Scanner(System.in);
        int idade, soma = 0, qtd = 0;

        System.out.println("Digite a idade de cada indivíduo (ou 0 para encerrar):");
        idade = sc.nextInt();

        while (idade != 0) {
            soma += idade;
            qtd += 1;
            double media = (double) soma / qtd;
            System.out.println("A idade média dos indivíduos é " + media);

            System.out.println("Digite a idade de cada indivíduo:");
            idade = sc.nextInt();
              
        }
       
        
            System.out.println("O recebimento de dados foi encerrado. ");
        
    }
	

}


