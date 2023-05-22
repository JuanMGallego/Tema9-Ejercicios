package ejercicio01;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int num = 0;
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Generador de números aleatorios en orden");
		System.out.println("-> Pulse 'enter' para continuar");
		System.out.println();
		
		sc.nextLine();
		
		while(numeros.size() < 20) {
			
			num = (int)(Math.random() * 100);
			numeros.add(num);
			
		}
		
		System.out.println(numeros);
		
		sc.close();
		
	}
	
}
