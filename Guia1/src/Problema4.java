import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=0;
		int contador=0;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();	
		}
		System.out.println("Resultado");
		for(int i=0;i<cantidad;i++) {
			if(arreglo[i]>=1&&arreglo[i]<=10000000) {
				for (j=5; arreglo[i]/j>=1; j *= 5) {
		            contador += arreglo[i]/j;
				}
			}
			else {
				System.out.println("NUMERO ERRONEO");
			}
			System.out.println("Valor para "+arreglo[i]+" : "+contador);	
			contador=0;
		}
	}
}