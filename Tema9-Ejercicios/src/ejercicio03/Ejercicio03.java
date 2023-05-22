package ejercicio03;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		String nombre = "";
		
		TreeSet<String> nombres = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Generador de lista de nombres ordenados alfabéticamente");
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
