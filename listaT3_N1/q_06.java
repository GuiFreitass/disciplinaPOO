package br.edu.principal;

import java.util.Scanner;
import br.edu.metodo.*;

public class Principal {

	public static void main(String[] args) {
		/*(6) Foi feita uma estatistica em cinco cidade brasileiras para coletar dados sobre acidentes de trânsito. Foram OBTIDOS OS seguintes dados:
		a) código da cidade;
		b) número de veículos de passeio (em 1999);
		c) número de acidentes de trânsito com vítimas (em 1999);
	Deseja-se saber:
		a) qual o maior e menor índice de acidentes de trânsito e a que cidades pertecem;
		b) qual a média de veículos nas cinco cidades juntas;
		c) qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio
	*/
			
		
			int codCity1,numVei1,numAcid1;
			int codCity2,numVei2,numAcid2;
			int codCity3,numVei3,numAcid3;
			int codCity4,numVei4,numAcid4;
			int codCity5,numVei5,numAcid5;
			
			Scanner sc = new Scanner (System.in);
			
			//Dados da cidade1
			System.out.println("Digite o codigo da cidade1: ");
			codCity1= sc.nextInt();
			System.out.println("Digite o número de veiculos na cidade1: ");
			numVei1= sc.nextInt();
			System.out.println("Digite o número de acidentes na cidade1: ");
			numAcid1= sc.nextInt();
			
			//Dados da cidade2
			System.out.println("Digite o codigo da cidade2: ");
			codCity2= sc.nextInt();
			System.out.println("Digite o número de veiculos na cidade2: ");
			numVei2= sc.nextInt();
			System.out.println("Digite o número de acidentes na cidade2: ");
			numAcid2= sc.nextInt();
			
			//Dados da cidade3
			System.out.println("Digite o codigo da cidade3: ");
			codCity3= sc.nextInt();
			System.out.println("Digite o número de veiculos na cidade3: ");
			numVei3= sc.nextInt();
			System.out.println("Digite o número de acidentes na cidade3: ");
			numAcid3= sc.nextInt();
			
			//Dados da cidade4
			System.out.println("Digite o codigo da cidade4: ");
			codCity4= sc.nextInt();
			System.out.println("Digite o número de veiculos na cidade4: ");
			numVei4= sc.nextInt();
			System.out.println("Digite o número de acidentes na cidade4: ");
			numAcid4= sc.nextInt();
			
			
			//Dados da cidade5
			System.out.println("Digite o codigo da cidade5: ");
			codCity5= sc.nextInt();
			System.out.println("Digite o número de veiculos na cidade5: ");
			numVei5= sc.nextInt();
			System.out.println("Digite o número de acidentes na cidade5: ");
			numAcid5= sc.nextInt();
			
			//metodo calcular maior ou menor
		
			calcMaiorEMenor obj1 = new calcMaiorEMenor();
		int[] numAcid = { numAcid1, numAcid2, numAcid3, numAcid4, numAcid5 };
		int maior =obj1.calcMaior(numAcid);
		int menor = obj1.calcMenor(numAcid);
		System.out.println("O maior indice é: "+ maior);
		System.out.println("O menor indice é: "+ menor);
		// Atualiza o maior e menor índice de acidentes e suas cidades correspondentes
		if (maior == numAcid1) {
			System.out.println("O codigo da cidade com maior indice é:" + codCity1);
				}
		if (maior == numAcid2) {
			System.out.println("O codigo da cidade com maior indice é:" + codCity2);
		}
		if (maior == numAcid3) {
			System.out.println("O codigo da cidade com maior indice é:" + codCity3);
		}
		if (maior == numAcid4) {
			System.out.println("O codigo da cidade com maior indice é:" + codCity4);
		}
		if (maior == numAcid5) {
			System.out.println("O codigo da cidade com maior indice é:" + codCity5);
		}
		
		//if menor
		if (menor == numAcid1) {
			System.out.println("O codigo da cidade com menor indice é:" + codCity1);
				}
		if (menor == numAcid2) {
			System.out.println("O codigo da cidade com menor indice é:" + codCity2);
		}
		if (menor == numAcid3) {
			System.out.println("O codigo da cidade com menor indice é:" + codCity3);
		}
		if (menor == numAcid4) {
			System.out.println("O codigo da cidade com menor indice é:" + codCity4);
		}
		if (menor == numAcid5) {
			System.out.println("O codigo da cidade com menor indice é:" + codCity5);
		}
		//3 parte 
			 //(b) qual a média de veículos nas cinco cidades juntas;
			int mediaVel= (numVei1+numVei2+numVei3+numVei4+numVei5)/5;
			System.out.println("A média de veiculos que tem nas cincos cidades é:" + mediaVel);
			
			//c) qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio
			double mediaAcid= obj1.calcMediaAcid(numAcid);
			System.out.println("A média de acidentes nas cidades com menos de 2.000: " + mediaAcid);
		
	}

}
