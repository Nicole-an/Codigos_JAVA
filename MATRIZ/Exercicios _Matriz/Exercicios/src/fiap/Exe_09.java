package fiap;

import java.util.Scanner;

public class Exe_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//var 
		int maiorLinha = 0, maiorInd = 0; 
		int menorLinha = 0, menorInd = 0; 
		
		//vetor 
		String prod [] = new String [] {"Notebook", "Computadores", "Tablets", "Servidores"};
		
		//matriz
		int qtdProd [] [] = new int [7] [4];
		
		//carregar matriz 
		for (int c = 0; c < 4; c++) {
			for (int l = 0; l < 4; l++) {
				System.out.println("Qtd de " + prod [c] + "por trimestre: ");
				prod [c] = entrada.next();
			}
		}
		
	}//main

}
