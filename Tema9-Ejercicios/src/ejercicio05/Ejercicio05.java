package ejercicio05;

import java.util.HashMap;
import java.util.Map;
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
					
					System.out.print("Introduzca el nombre del producto: ");
					nombre = sc.nextLine();
					System.out.println();
					
					System.out.print("Introduzca el precio: ");
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
					
					System.out.print("Introduzca el nombre del producto: ");
					nombre = sc.nextLine();
					System.out.println();
					
					if (productos.containsKey(nombre))  {
						
						productos.remove(productos, nombre);
						
						System.out.println("Producto eliminado correctamente");
						System.out.println();
						
					} else {
						
						System.out.println("El producto no existe");
						System.out.println();
						
					}
					
				}
				
				case 3 -> {
					
					for (Map.Entry<String, Double> indice : productos.entrySet()) {
						
						System.out.println("Producto: " + indice.getKey());
						System.out.println("Precio: " + indice.getValue());
						System.out.println();
						
					}
					
				}
				
				default -> {
					
					System.out.println("Opción inválida");
					System.out.println();
					
				}
			
			}
			
		} while (option != 0);
		
	}
	
	static private void menu() {
		
		System.out.println("__________________________");
		System.out.println("|                        |");
		System.out.println("| 1. Alta de producto    |");
		System.out.println("| 2. Baja de producto    |");
		System.out.println("| 3. Listar existencias  |");
		System.out.println("| 0. Salir               |");
		System.out.println("|________________________|");
		System.out.println();
		
	}
	
}
