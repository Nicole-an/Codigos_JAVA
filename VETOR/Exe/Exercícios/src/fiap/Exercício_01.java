package fiap;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// vetor
		String[] arrayMeses = new String[] { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out",
				"Nov", "Dez" };
		double[] arrayTemp = new double[12];

		// var
		double maiorTemp = 0, menorTemp = 0;
		String maiorMes = null, menorMes = null;
		int maiorIndice = 0, menorIndice = 0;

		// carregando vetor
		for (int i = 0; i < 12; i++) {

			System.out.println("Informe a temperatura do mês de " + arrayMeses[i] + ":");
			arrayTemp[i] = entrada.nextDouble();

			if (arrayTemp[i] > maiorTemp) {

				maiorTemp = arrayTemp[i];
				maiorMes = arrayMeses[i];
				maiorIndice = i;// armazena o indice referente ao vetor

			} // if

			if (i == 0) {

				menorTemp = arrayTemp[i];
				menorMes = arrayMeses[i];
				menorIndice = i;

			} else {

				if (arrayTemp[i] < menorTemp) {

					menorTemp = arrayTemp[i];
					menorMes = arrayMeses[i];
					menorIndice = i;

				} // if

			} // else

		} // for

		System.out.println("Mês da maior temperatura: " + maiorMes + " - Temperatura: " + maiorTemp);
		System.out.println("Mês da menor temperatura: " + menorMes + " - Temperatura: " + menorTemp);

	}// main

}
