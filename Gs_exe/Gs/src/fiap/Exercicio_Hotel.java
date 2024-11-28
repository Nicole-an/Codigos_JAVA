package fiap;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_Hotel {

	static Scanner entrada = new Scanner(System.in);

	static String[][] arrayHDados = new String[5][2];
	static int[][] arrayHNumero = new int[5][2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrayNomeProduto = new String[] { "Refrigerante Lata", "Água sem gás", "Água com gás",
				"Suco de Laranja", "Barra de Chocolate" };
		double[] arrayPrecoProduto = new double[] { 2.80, 1.90, 2.10, 2.30, 4.90 };
		String[] arrayNomeServico = new String[] { "Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar" };
		double[] arrayPrecoServico = new double[] { 10.50, 60.80, 42.90, 35.60, 60.40 };

		// CARREGAMENTO
		System.out.println(
				"------------------------------------ Controle de hospedagem do Hotel Boa Viagem ------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.print("Nome do cliente: ");
			arrayHDados[i][0] = entrada.next();

			System.out.print(
					"Tipo de acomodacao - [ S - Single, D - Double, SL - Suite Luxo, SR - Suite Presidencial]: ");
			arrayHDados[i][1] = entrada.next();

			while (!(arrayHDados[i][1].equalsIgnoreCase("S")) && !(arrayHDados[i][1].equalsIgnoreCase("D"))
					&& !(arrayHDados[i][1].equalsIgnoreCase("SL")) && !(arrayHDados[i][1].equalsIgnoreCase("SR"))) {
				System.out.print(
						"Tipo de acomodacao - [ S - Single, D - Double, SL - Suite Luxo, SR - Suite Presidencial]:");
				arrayHDados[i][1] = entrada.next();
			} // while

			System.out.print("Número do quarto: ");
			arrayHNumero[i][0] = i + 1;
			System.out.println(arrayHNumero[i][0]);

			System.out.print("Qtd diarias: ");
			arrayHNumero[i][1] = entrada.nextInt();

			System.out.println("----------------------------------------------------------------------------------");
		} // i

		// CHAMADAS
		// 1)
		int[][] qtdConsumo = consumoProd(arrayNomeProduto);
		// 2)
		int[][] qtdServ = consumoServ(arrayNomeServico);
		// 3)
        
		
		
	}// main

	public static int[][] consumoProd(String[] arrayNomeProduto) {

		int[][] qtdConsumo = new int[5][5];

		System.out.println("Consumo de Produtos por Hospedagem");
		for (int h = 0; h < 5; h++) {

			System.out.println("---------------------- Hospedagem " + (h + 1) + "----------------------");

			for (int p = 0; p < 5; p++) {

				System.out.print("Qtd consumida do produto " + "(" + arrayNomeProduto[p] + "):");
				qtdConsumo[h][p] = entrada.nextInt();

			} // p movimenta
		} // h trava

		return qtdConsumo;

	}// consumoProd

	public static int[][] consumoServ(String[] arrayNomeServico) {

		int[][] qtdServ = new int[5][5];

		System.out.println("");
		System.out.println("------- Consumo de Servico por Hospedagem -------");
		for (int h = 0; h < 5; h++) {

			System.out.println("---------------------- Hospedagem " + (h + 1) + "----------------------");

			for (int s = 0; s < 5; s++) {

				System.out.print("Qtd consumida do servico " + "(" + arrayNomeServico[s] + "):");
				qtdServ[h][s] = entrada.nextInt();

			} // p movimenta
		} // h trava

		return qtdServ;

	}// consumoProd

	public static double calculoDiaria(String[][] arrayHDados, int[][] arrayHNumero) {

		double valorEstadia = 0;

		for (int h = 0; h < 5; h++) {
			if (arrayHDados[h][1].equalsIgnoreCase("S")) {
				valorEstadia = 245 * arrayHNumero[h][1];
			} else if (arrayHDados[h][1].equalsIgnoreCase("D")) {
				valorEstadia = 280 * arrayHNumero[h][1];
			} else if (arrayHDados[h][1].equalsIgnoreCase("SL")) {
				valorEstadia = 310 * arrayHNumero[h][1];
			} else {
				valorEstadia = 400 * arrayHNumero[h][1];
			}//fim if

		} // for h

		return valorEstadia;
	}//calculoDiaria

	
}// class
