package fiap;

import java.util.Scanner;

public class Exercício_01_Correção {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//vetores
		double [] temp = new double [12];
		String [] meses = new String [] {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		
		//var
		double maiorTemp = 0, menorTemp = 0; 
		String maiorMes = null, menorMes = null;
		int maiorIndice = 0, menorIndice = 0;
		
		for (int i = 0; i < 12; i ++) {
			System.out.print("Digite a temperatura do mês de " +  meses [i] + ":");
			temp [i] = entrada.nextDouble();
			
			if (temp [i] > maiorTemp) {
				maiorTemp = temp[i];
				maiorMes = meses [i];
				
				maiorIndice = i;//armazena o indice referente ao vetor
				
				//System.out.println("Maior Temperatura: " + maiorTemp + " - Mês: " + meses);
				
			} 
			
			if (i == 0) {
				
			}
			//else {
				//if (menorTemp > maiorTemp) {
					//System.out.println("Menor Temperatura: " + menorTemp + " - Mês: " + meses);
				//}
			
			
		}//for
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
