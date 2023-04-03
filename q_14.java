package br.edu.prinicpal;

	import java.util.Calendar;
	import java.util.Scanner;

	public class Principal {

	public static void main(String[] args) {
	/* q_14 Faça um programa calcule e mostre: que ano de nascimento de uma pessoa e o ano atual, receba o ano
	a) a idade dessa pessoa em anos: ;
	b) a idade dessa pessoa em meses: ;
	c) a idade dessa pessoa em dias;
	d) a idade dessa pessoa em semanas. */


	Scanner sc =  new Scanner (System.in);
	System.out.println("Digite o ano do seu nascimento: ");
	int anoNascimento = sc.nextInt();

	Calendar cal = Calendar.getInstance();
	int ano = cal.get(Calendar.YEAR);

	int idadeAno = (ano - anoNascimento);
	System.out.println("Sua idade é  " + idadeAno + " anos." );

	int idadeMes = (idadeAno * 12);
	System.out.println("Sua idade é  " + idadeMes + " meses.");

	int idadeDia = (idadeMes * 30) + (idadeAno * 5);
	System.out.println("Sua idade é  " + idadeDia + " dias.");

	int idadeSemana = (idadeDia * 7);
	System.out.println("Sua idade é  " + idadeSemana + " semanas.");



	}

	}

