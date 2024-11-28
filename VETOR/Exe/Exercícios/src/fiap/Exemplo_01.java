package fiap;

import java.util.Scanner;

public class Exemplo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//vetores 
		String [] arrayTimes = new String [5];
		
   		//entrada
		for (int i = 0; i < arrayTimes.length; i++) {
			
			System.out.println("Digite o nome do time " + (i+1) + ":"); //calcular o numero depois da execução da linha
			arrayTimes [i] = entrada.nextLine(); //nextLine para ler por completo, sem ignorar espaço
		
		}//for
		
		//saida
		for (int i = 0; i < arrayTimes.length; i++) { //exibe vetor
			
			System.out.println("Time " + (i+1) +  ": " + arrayTimes[i]);
		
		}//for2
		
		
		
	}//main

}
