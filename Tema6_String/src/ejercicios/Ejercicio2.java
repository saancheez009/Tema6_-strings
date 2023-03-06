package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String contraseña;
		String contraseña2;
		
		int cad1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¡Bienvenid@ al juego de acierta la constraseña!");
		
		
		System.out.println("Jugador 1 por favor introduzca la contraseña:");
		contraseña=sc.next();
		
		
	
		 
	
		do {
			System.out.println("Jugador 2 adivine la contraseña");
			contraseña2=sc.next();
			
			cad1=contraseña2.compareTo(contraseña);
			
			if(cad1 > 0) {
				System.out.println("La contraseña debe ser menor alfabeticamente");
			}else if (cad1<0) {
				System.out.println("La contraseña debe ser mayor alfabeticamnete");
			}
			
			
		}while(cad1!=0);
		
		System.out.println("¡ENHORABUENA! Ha acertado la contraseña");
	}

}
