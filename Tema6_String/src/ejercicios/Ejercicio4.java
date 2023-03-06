package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String frase;
		String fraseInversa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca una frase");
		frase=sc.next();
		fraseInversa=sc.nextLine();
		fraseInversa=fraseInversa.replace(" ","");
		frase=fraseInversa;
		
		System.out.println(FuncionEjercicio4.alReves(frase, fraseInversa));

	
}
}