package ejercicio04;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int numero = 0;
		int estrellas = 0;
		String terminar = "";
		
		TreeMap<Integer, Integer> listNumeros = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> listEstrellas = new TreeMap<Integer, Integer>();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Generador de lista de nombres ordenados alfabéticamente");
		System.out.println();
		
		while(!terminar.equals("fin")) {
			
			System.out.println("Introduzca los 5 números de su bono de lotería: ");
			
			for(int i=1; i<=5; i++) {
				
				numero = sc.nextInt();
				sc.nextLine();
				
				if(listNumeros.containsKey(numero)) {
					
					listNumeros.replace(numero, listNumeros.get(numero) + 1);
					
				} else {
					
					listNumeros.put(numero, 1);
					
				}
				
			}
			
			System.out.println();
			System.out.println("Introduzca las 2 estrellas complementarias: ");
			System.out.println();
			
			for(int i=1; i<=2; i++) {
				
				estrellas = sc.nextInt();
				sc.nextLine();
				
				if(listEstrellas.containsKey(estrellas)) {
					
					listEstrellas.replace(estrellas, listEstrellas.get(estrellas)+1);
					
				} else {
					
					listEstrellas.put(estrellas, 1);
					
				}
				
			}
			
			System.out.println("Introduzca 'fin' para terminar / 'enter' para continuar");
			terminar = sc.nextLine();
			System.out.println();
			
		}
		
		
		
		System.out.println("Números: " + listNumeros);
		System.out.println("Estrellas: " + listEstrellas);
		
		sc.close();
		
	}

}
