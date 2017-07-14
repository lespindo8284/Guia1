import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema3 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese Numeros: ");
        String s = br.readLine();
        
        String[] splitStr = s.split("\\s+");
        
        if(Integer.parseInt(splitStr[0])>=1&&Integer.parseInt(splitStr[0])<=100) {
        	if(Integer.parseInt(splitStr[1])>=1&&Integer.parseInt(splitStr[1])<=100) {
	        	int suma = Integer.parseInt(splitStr[0])+ Integer.parseInt(splitStr[1]);
	            System.out.println("Resultado: "+suma);
        	}else {
            	System.out.println("Valores Incorrectos: "+Integer.parseInt(splitStr[1]));
            }
        }
        else {
        	System.out.println("Valores Incorrectos: "+Integer.parseInt(splitStr[0]));
        }
    }
}
