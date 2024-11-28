
import java.util.Scanner;

public class G_Exercicio05 {

	static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		//chamada fun��o carregaVetor;
		double [] numeros = carregaVetor();
	
		
		//chamada fun��o ordenaNumeros
		ordenaNumeros(numeros);
		
		System.out.println("----------------N�MEROS ORDENADOS-----------------");
		for(int i=0;i<5;i++) {
			System.out.print(numeros[i]+"\t");
		}

	}//fecha Main
	
	
	//1�M�todo Carregar Vetor
	
	public static double[] carregaVetor() {
		
		double [] numeros = new double [5];
		
		for(int i=0;i<5;i++) {
		
			System.out.println("Digite o "+(i+1)+"� n�mero:");
			numeros[i]=entrada.nextDouble();
		}
			
		return numeros;
	}
	
	
	 //2�M�todo Ordenar N�meros
	
	public static double[] ordenaNumeros(double [] numeros) {
		
		double aux=0;
		
		for(int i=0; i<5;i++) {
			
			for(int j=0;j<4;j++) {
				
				if(numeros[j] > numeros[j+1]) {
					
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1]=aux;
				}
			}
		}
			
		
		return numeros;
		
	}
	
	
	

}
