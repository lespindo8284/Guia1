import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=1,k=1;
		int contador=0;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();
		}
		
		j=1;
		for(int i=0;i<cantidad;i++) {
			if(arreglo[i]>=0&&arreglo[i]<=1000000000){
				for(k=1;k<=(arreglo[i]);k++){
			         if(arreglo[i]%k==0){
			             contador++;
			         }
				}
				if(contador!=2&&arreglo[i]!=1){
					System.out.println("NOT PRIME");
				}else{
	                System.out.println("PRIME");
				}
				k=1;
				contador=0;
			}
			else {
				System.out.println("NUMERO ERRONEO");
			}
		}
	}

}
