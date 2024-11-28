package fiap;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//vetores
		String [] arrayNome = new String [5];
		
		//var
		String nomeBusca = null;
		
		//carregando vetores
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um nome " + (i+1) + ":"); //calcular o numero depois da execução da linha
			arrayNome [i] = entrada.next();
			
		}//for
		
		for (int i = 0; i < 1; i++) {
			
			System.out.println("Digite o nome para a procura: ");
			arrayProcura [i] = entrada.next();
			
		}//for
		
		System.out.println("ACHEI " + arrayNome);
		System.out.println("NAO ACHEI " + arrayNome);
		
		
	}//main

}
