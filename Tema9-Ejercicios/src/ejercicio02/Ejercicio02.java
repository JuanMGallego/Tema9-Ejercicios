package ejercicio02;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String nombre = "";
		
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Generador de lista de nombres");
		System.out.println();
		System.out.print("Introduzca un nombre: ");
		nombre = sc.nextLine();
		System.out.println();
		
		while(!nombre.equals("fin")) {
			
			nombres.add(nombre);
			
			System.out.print("Introduzca otro nombre: ");
			nombre = sc.nextLine();
			System.out.println();
			
		}
		
		System.out.println("Lista final: ");
		System.out.print(nombres);
		
		sc.close();

	}

}
