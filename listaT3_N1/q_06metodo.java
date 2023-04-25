package br.edu.metodo;

public class calcMaiorEMenor {
	public static int calcMaior(int[] numAcid) {
		int maior = numAcid[0];
		 
		
		for (int i = 1; i < numAcid.length; i++) {
	        if (numAcid[i] > maior) {
	            maior = numAcid[i];
	        }

	    }
		return maior ;
	    
}


	public static int calcMenor(int[] numAcid) {
	
		int menor = numAcid[0]; 
		for (int i = 1; i < numAcid.length; i++) {
		if (numAcid[i] < menor) {
            menor = numAcid[i];
        }
			}
	return menor;
	}
	
	public static double calcMediaAcid(int[] numAcid) {
	    int soma = 0;
	    int quantidade = 0;
	    
	    for (int i = 0; i < numAcid.length; i++) {
	        if (numAcid[i] < 2000) {
	            soma += numAcid[i];
	            quantidade++;
	        }
	    }
	    
	    if (quantidade == 0) {
	        return 0;
	    } else {
	        return (double) soma / quantidade;
	    }

	
}
}
