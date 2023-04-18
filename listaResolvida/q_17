package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Um trabalhador recebeu seu salário e depositou em sua conta corrente bancária. 
		Esse trabalhador emitido dois cheques e agora deseja saber seu saldo atual. 
		Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está zerado.*/
			Scanner sc = new Scanner (System.in) ;
			System.out.println ( "Digite o seu salario");
			double salario = sc.nextDouble() ;
			System.out.println ( "Digite o valor do seu primeiro cheque");
			double deposito = sc.nextDouble() ;
			double chequeImposto = (deposito * 0.38) + deposito ;
			System.out.println ( "Digite o valor do seu segundo cheque");
			double deposito2 = sc.nextDouble() ;
			double chequeImposto2 = (deposito2 * 0.38) + deposito2 ;
			double saldo = salario - (chequeImposto + chequeImposto2) ;
			System.out.println("Seu saldo é: " + saldo);
			

	}

}
