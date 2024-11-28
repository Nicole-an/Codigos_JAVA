
import java.util.Scanner;

public class G_Exercicio05 {

	static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		//chamada função carregaVetor;
		double [] numeros = carregaVetor();
	
		
		//chamada função ordenaNumeros
		ordenaNumeros(numeros);
		
		System.out.println("----------------NÚMEROS ORDENADOS-----------------");
		for(int i=0;i<5;i++) {
			System.out.print(numeros[i]+"\t");
		}

	}//fecha Main
	
	
	//1ºMétodo Carregar Vetor
	
	public static double[] carregaVetor() {
		
		double [] numeros = new double [5];
		
		for(int i=0;i<5;i++) {
		
			System.out.println("Digite o "+(i+1)+"º número:");
			numeros[i]=entrada.nextDouble();
		}
			
		return numeros;
	}
	
	
	 //2ºMétodo Ordenar Números
	
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
