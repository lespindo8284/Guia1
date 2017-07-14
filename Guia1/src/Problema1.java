import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=1;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();	
		}
		
		j=1;
		System.out.println("Resultado");
		for(int i=0;i<cantidad;i++) {
			System.out.println("Valor "+j+++" : "+Integer.bitCount(arreglo[i]));	
		}
		
	}
}
