package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//esta es la frase introducida por el usuario sin invertir
		String frase;
		//Esta es la frase introducida invertida
		String fraseInversa;
		
		//Importamos e introducimos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca una frase 
		System.out.println("Por favor introduzca una frase para decirle si es palindroma o no");
		fraseInversa=sc.nextLine(); //leemos la frase
		
		fraseInversa=fraseInversa.replace(" ","");
		frase=fraseInversa;
		fraseInversa="";
		
		for(int i=frase.length()-1;i>=0;i--) {
			
			fraseInversa+=frase.charAt(i);
			
		}
		
		if(frase.equals(fraseInversa)) {
			System.out.println("Es palíndroma ");
		}else {
			System.out.println("No es palíndroma");		
			}
		sc.close();
	}

}
