package ejercicio05;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		String nombre = "";
		double precio = 0;
		
		HashMap<String, Double> productos = new HashMap<>();
		int option;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			menu();
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			
				case 1 -> {
					
					System.out.println("Introduzca el nombre del producto: ");
					nombre = sc.nextLine();
					System.out.println("Introduzca el precio: ");
					precio = sc.nextDouble();
					sc.nextLine();
					System.out.println();
					if (!productos.containsKey(nombre)) {
						
						productos.put(nombre, precio);
						
					} else {
						
						System.out.println("El producto ya existe");
						
					}
					
				}
				
				case 2 -> {
					
					System.out.println("Introduzca el nombre del producto: ");
					nombre = sc.nextLine();
					
				}
				
				default -> {
					
					
					
				}
			
			}
			
		} while (option != 0);
		
	}
	
	static private void menu() {
		
		
		
	}
	
}
