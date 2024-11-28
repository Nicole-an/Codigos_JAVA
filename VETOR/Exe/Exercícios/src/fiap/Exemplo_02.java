package fiap;

import java.util.Scanner;

public class Exemplo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//vetor  
		String [] arrayNome = new String [5];
		int [] arrayIdade = new int [5];
		
		//entrada
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Informe seu nome: ");
			arrayNome [i] = entrada.next();
			
			System.out.println("Informe sua idade: ");
			arrayIdade [i] = entrada.nextInt();
			
		}//for
		
		for (int i = 0; i < 5; i++) {
			
			if (arrayIdade [i] > 21) {
				
				System.out.println("Pessoa com idade maior que 21: " + arrayNome [i] + " - " + "Idade: " + arrayIdade [i]);
				
			}//if
			
		}//for
		
		
		
		
		
	}//main

}
