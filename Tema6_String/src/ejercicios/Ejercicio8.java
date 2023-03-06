package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String frase;
		String prefijo= "Javalín, javalón\t";
		String sufijo="\tjavalén, len, len" ;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un mensaje");
		frase=sc.nextLine();
		
		if(frase.startsWith(prefijo) || frase.endsWith(sufijo) ) {
			
			System.out.println("La frase está en idioma javalandia");
			
			for(int i=0; i<=frase.length();i++) {
				
				frase = frase.replace("Javalín, javalón\t", "");
				frase = frase.replace("\tjavalén, len, len", "");	
				
			}
			System.out.println("La frase traducida es: "+frase);
		}else {
			System.out.println("La frase no está en idioma javalandia ");
		}

		
		
	}

}
