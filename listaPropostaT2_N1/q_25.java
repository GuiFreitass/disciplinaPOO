package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*((25) Uma empresa decidiu dar uma gratificação de natal aos seus funcionários, baseada no número de horas extras 
		 * e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido pela consulta na tabela a seguir, em que:
		 * H = (número de horas extras) - 2/3 * (número de horas-falta) */
		
				Scanner sc = new Scanner (System.in);
				System.out.println ("Digite o número de horas extras trabalhadas: ");
				 double horasExt = sc.nextDouble() ;
				System.out.println("Digite o número de horas que faltou ao trabalho: ");
				 double horasFal= sc.nextDouble() ;
				 double H = (horasExt) - 2/3* (horasFal);
				 
				 if (H> 2400) {
				System.out.println("A gratificação é de R$500");	 
					 	 
				 		}
				 
				 if (H > 1800 && H<= 2400) {
						System.out.println("A gratificação é de R$400");	 
							  
						 }
				 
				 if (H >= 1200 && H<= 1800) {
						System.out.println("A gratificação é de R$300");	 
							 
						 }
				 if (H >= 600 && H< 1200) {
						System.out.println("A gratificação é de R$200");	 
							 
						 }
				 
				 if (H <600) {
						System.out.println("A gratificação é de R$100");	 
							 
						 }
				 
	}

}
