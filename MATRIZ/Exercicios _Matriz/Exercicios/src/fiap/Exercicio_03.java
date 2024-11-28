package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fp = new DecimalFormat("R$ ##0.00");

		// vetor
		String[] lojas = new String[] { "Renner", "Riachuelo", "Youcom" };
		String[] prod = new String[] { "Calças", "Sapatos", "Camisetas", "Blusas" };

		// matriz
		double[][] preco = new double[4][3];

		// entrada

//		for (int l = 0; l < 3; l++) {
//			System.out.print("Informe o nome da " + (l + 1) + " ° loja: ");
//			lojas[l] = entrada.next();
//		} // for lojas
//
//		for (int p = 0; p < 4; p++) {
//			System.out.print("Informe o nome do " + (p + 1) + " ° produto: ");
//			prod[p] = entrada.next();
//		} // for prod

		for (int p = 0; p < 4; p++) {

			for (int l = 0; l < 3; l++) {

				preco[p][l] = (double) (Math.random() * 190);

			} // for l

		} // for p

		System.out.println("");
		System.out.println("---------- PREÇOS DOS PRODUTOS POR LOJA ----------");

		for (int p = 0; p < 4; p++) {
			System.out.println("--- Produto " + prod[p] + ":");

			for (int l = 0; l < 3; l++) {
//				System.out.println("Digite o preco do produto " + prod[p] + " " + "da loja " + lojas[l] + ":");
				System.out.println(" ------ Loja: " + lojas[l] + " " + "Preco: " + fp.format(preco[p][l]));
//				preco[p][l] = (int) (Math.random() * 200);
//				System.out.println(fp.format(preco[p][l]));
			} // for l
		} // for p

		System.out.println("\n ---------- PRODUTOS QUE CUSTAM MENOS DE R$ 120,00 -----------");
		for (int p = 0; p < prod.length; p++) {
			System.out.println("--- Produto " + prod[p]);
			for (int l = 0; l < lojas.length; l++) {
				if (preco[p][l] < 120) {
					System.out.println(" ------ Loja: " + lojas[l] + ": " + fp.format(preco[p][l]));
				}//if
			}//for l
		}//for p
		
	}// main

}
