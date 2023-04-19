package qbr.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	/*(24)faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Essa pessoa vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-se que a cotação do 
		dólar é de R$ 1,80, 
		do marco alemão é de R$ 2,00 e 
		da libra esterlina é de R$ 1.57
		O programas deve fazer as conversões e mostrá-las.*/

		Scanner sc = new Scanner (System.in);
		System.out.println("Coloque sua quantia");
		double quantMoney = sc.nextDouble();
		double valDolar = quantMoney * 1.80;
		double valMarco = quantMoney * 2 ;
		double valLibra = quantMoney * 1.57;
		System.out.println("A quantidade de dinheiro que você tem é de: " + quantMoney);
		System.out.println("Seu dinheiro em dolar vale:" + valDolar);
		System.out.println("Seu dinheiro em marco alemão vale:" + valMarco);
		System.out.println("Seu dinheiro em libra estrelina vale:" + valLibra);
		
		
	}

}
   
