package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String frase = "";
		String palabra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca una frase palabra a palabra ");
		
		System.out.println("Cuando desee mostrar la frase, introduzca la palabra final");
		palabra=sc.next();
		
		while(!palabra.equals("final")) {
			
			frase+=palabra+" ";
			palabra=sc.next();
			
		}
		
		System.out.println(frase);
		
	}

}
