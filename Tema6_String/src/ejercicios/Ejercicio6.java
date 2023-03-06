package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Palabra que el usuario desea buscar 
		String palabra;
		//Frase introducida por el usuario 
		String frase;
		
		//Contador que cuenta el número de veces que aparece la palabra
		int contador=0;
		//Posicion de la palabra
		int pos;
		
		//Importamos el scanner parapoder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca una frase y la leemos
		System.out.println("Por favor introduzca una frase");
		frase=sc.nextLine();
		
		//Le pedimos al usuario que introduzca la palabra a buscar y la leemos
		System.out.println("Por favor introduzca una palabra: ");
		palabra=sc.nextLine();
		
		//Buscamos las posiciones en las que sale la palabra
		pos =frase.indexOf(palabra);
		
		//Mientras la posición de la palabra sea distinta de -1, contamos las posiciones de la palabra
		 while (pos !=-1) {
			 contador++;
			 
			 pos =frase.indexOf(palabra,pos+palabra.length());
		
		 }
		 
		 //Le mostramos al usuario el número de veces que aparece la palabra
		System.out.println("La palabra introducida aparece "+contador+" veces en la frase");

	}

}
