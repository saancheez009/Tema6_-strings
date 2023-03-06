package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String frase;
		int contador = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca una frase por teclado");
		frase=sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)==' ') {
				contador++;
			}
			
		}
		System.out.println("La frase tiene "+contador+" espacios");
	}

}
