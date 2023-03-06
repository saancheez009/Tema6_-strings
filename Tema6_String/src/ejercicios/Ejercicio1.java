package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		String cadena1 = "Macarena";
		String cadena2 = "Anastasia";
		
		int cad1=cadena2.compareTo(cadena1);
		int cad2=cadena1.compareTo(cadena2);
		
		System.out.println(cad1);
		System.out.println(cad2);
		
		if(cad1<cad2) {
			System.out.println("La cadena 1 es la más corta");
		}else {
			System.out.println("La cadena 2 es la más corta");
		}
	}
}
