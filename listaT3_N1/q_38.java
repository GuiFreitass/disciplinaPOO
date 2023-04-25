package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*(38) Faça um programa que receba o valor do salário mínimo e uma lista contendo a quantidade de quilowatts gasta por consumidor e o tipo de consumidor (1- Residencial, 2- Comercial ou 3- Industrial)
		Calcule e mostre:
		• o valor de cada quilowatt, sabendo que o quilowatt custa ⅛ do salário mínimo;
		• o valor a ser pago por cada consumidor (conta final mais acréscimo), considerando que o acréscimo é o mesmo da tabela a seguir. 
		• o faturamento geral da empresa;
		• a quantidade de consumidores que oagam entre R$500,00 e R$1000,00.

		Termine a entrada de dados com a quantidade de quilowatts igual a zero.*/
		   Scanner sc = new Scanner(System.in);

		        double salarioMinimo, valorKw;
		        int qtdKw, tipo;
		        double valorConta, faturamentoGeral = 0;
		        int qtdEntre500e1000 = 0;
		        double valorTotalContas = 0;

		        // Leitura do salário mínimo
		        System.out.print("Digite o valor do salário mínimo: ");
		        salarioMinimo = sc.nextDouble();

		        // Cálculo do valor de cada quilowatt
		        valorKw = salarioMinimo / 8;

		        // Leitura dos dados dos consumidores
		        System.out.print("\nDigite a quantidade de quilowatts consumidos (0 para encerrar): ");
		        qtdKw = sc.nextInt();

		        while (qtdKw != 0) {
		            // Leitura do tipo de consumidor
		            System.out.print("Digite o tipo de consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial): ");
		            tipo = sc.nextInt();

		            // Cálculo do valor da conta de cada consumidor
		            switch (tipo) {
		                case 1: // Residencial
		                    valorConta = qtdKw * valorKw;
		                    valorConta *= 1.05; // Acréscimo de 5%
		                    break;

		                case 2: // Comercial
		                    valorConta = qtdKw * valorKw;
		                    valorConta *= 1.1; // Acréscimo de 10%
		                    break;

		                case 3: // Industrial
		                    valorConta = qtdKw * valorKw;
		                    valorConta *= 1.15; // Acréscimo de 15%
		                    break;

		                default:
		                    System.out.println("Tipo de consumidor inválido!");
		                    continue;
		            }

		            // Soma do faturamento geral da empresa
		            faturamentoGeral += valorConta;

		            // Soma do valor total das contas
		            valorTotalContas += valorConta;

		            // Contagem de consumidores que pagam entre R$500,00 e R$1000,00
		            if (valorConta >= 500 && valorConta <= 1000) {
		                qtdEntre500e1000++;
		            }

		            // Leitura da quantidade de quilowatts do próximo consumidor
		            System.out.print("\nDigite a quantidade de quilowatts consumidos (0 para encerrar): ");
		            qtdKw = sc.nextInt();
		        }

		        // Impressão dos resultados
		        System.out.println("\nValor de cada quilowatt: R$" + valorKw);
		        System.out.println("Faturamento geral da empresa: R$" + faturamentoGeral);
		        System.out.println("Quantidade de consumidores que pagam entre R$500,00 e R$1000,00: " + qtdEntre500e1000);
		    }
		}

		        
		                   

	


