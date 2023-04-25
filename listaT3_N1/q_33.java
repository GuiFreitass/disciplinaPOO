package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*(33) Faça um programa para ler o código, o sexo (M- Masculino, F- Feminino) 
		 * e o número de horas/aula dadas mensalmente pelos professores de uma 
		 * universidade, sabendo-se que cada hora/aula vale R$18,50. Emita uma 
		 * listagem contendo o código, o salário bruto e o salário líquido (levando
		 *  em consideração os descontos explicados a seguir) de todos os professores 
		 *  lidos. Mostre também a média dos salários LÍQUIDOS dos professores do sexo 
		 *  masculino e a média dos salários BRUTOS dos professores do sexo feminino.
		 *  Considere: 
			• desconto para homens 10% e para mulheres 5%;
			• as informações terminarão quando for lido o código = 99999.*/
			
			Scanner sc = new Scanner(System.in);

		    int codigo, horasAula;
		    char sexo;
		    double salBruto, salLiquido;
		    double totalSalHomens = 0, totalSalMulheres = 0;
		    int contHomens = 0, contMulheres = 0;
		    
		    System.out.println("*** Salários dos Professores ***");
		    
		    //Receber dados
		    System.out.print("Digite o código (cód. p/ sair: 99999): ");
            codigo = sc.nextInt();
            
            while (codigo != 99999){
		   
            System.out.print("Sexo (M/F): ");
            sexo = sc.next().charAt(0);
            
            System.out.print("Horas/aula mensais: ");
            horasAula = sc.nextInt();
            
         // Calcula o salário bruto
            salBruto = horasAula * 18.5;
            
         // Calcula o desconto
            double desconto;
            if (sexo == 'M') {
                desconto = salBruto * 0.1;
            } else {
                desconto = salBruto * 0.05;
            }
            
         // Calcula o salário líquido
            salLiquido = salBruto - desconto;
            
         // Soma os salários para cálculo das médias
            if (sexo == 'M') {
                totalSalHomens += salLiquido;
                contHomens++;
            }
            if (sexo == 'F') {
                totalSalMulheres += salBruto;
                contMulheres++;
            }
            
         // Imprime a listagem com as informações
            System.out.println("Código: " + codigo);
            System.out.println("Salário bruto: R$" + salBruto);
            System.out.println("Salário líquido: R$" + salLiquido);

         // Calcula as médias
            double mediaSalariosHomens = totalSalHomens / contHomens;
            double mediaSalariosMulheres = totalSalMulheres / contMulheres;

         // Imprime as médias
            System.out.println("Média salarial dos professores do sexo masculino: R$" + mediaSalariosHomens);
            System.out.println("Média salarial dos professores do sexo feminino: R$" + mediaSalariosMulheres);
        
            
            System.out.print("Digite o código (cód. p/ sair: 99999): ");
            codigo = sc.nextInt();
            
            }
            
            System.out.println("Recebimento de dados encerrado.");

            
            	}  
            
           
            
	}

