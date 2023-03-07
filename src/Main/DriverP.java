package Main;

import java.util.Scanner;

public class DriverP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc = 0;
		
		do {
			Factory fact = new Factory();
			Scanner scann = new Scanner(System.in);
			System.out.println("Hola, bienvenido a tu tienda online, elije la estructura para ver tu nventario :)");
			System.out.println("1. HashMap");
			System.out.println("2. TreeMap");
			System.out.println("3. LinkedHashMap");
			opc = Integer.parseInt(scann.nextLine());
			
			switch (opc) {
			case  1: {
				
				int res = 0;
				
				do {
				System.out.println("Quiere:");
				System.out.println("1. Agregar un producto");
				System.out.println("2. Mostrar la categoria del producto");
				System.out.println("3. Mostrar los datos del producto, categoria y la cantidad de cada articulo");
				System.out.println("4. Mostrar los datos del producto, categoría y la cantidad de cada artículo que el usuario tiene en su\r\n"
						+ "colección, ordenadas por tipo");
				System.out.println("5. Mostrar el producto y la categoría de todo el inventario");
				System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo");
				
				switch (res) {
				case 1: {
				
				}break;
				
				case 2: {
					
				}break;
				
				case 3: {
					
				}break;
				
				case 4: {
					
				}break;
				
				case 5: {
					
				}break;
				
				case 6: {
					
				}break;
				
				}
				
				}while (res != 6);
			}break;
			
			case 2: {
int res = 0;
				
				do {
				System.out.println("Quiere:");
				System.out.println("1. Agregar un producto");
				System.out.println("2. Mostrar la categoria del producto");
				System.out.println("3. Mostrar los datos del producto, categoria y la cantidad de cada articulo");
				System.out.println("4. Mostrar los datos del producto, categoría y la cantidad de cada artículo que el usuario tiene en su\r\n"
						+ "colección, ordenadas por tipo");
				System.out.println("5. Mostrar el producto y la categoría de todo el inventario");
				System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo");
				
				switch (res) {
				case 1: {
				
				}break;
				
				case 2: {
					
				}break;
				
				case 3: {
					
				}break;
				
				case 4: {
					
				}break;
				
				case 5: {
					
				}break;
				
				case 6: {
					
				}break;
				
				}
				
				}while (res != 6);
			}break;
			
			case 3: {
int res = 0;
				
				do {
				System.out.println("Quiere:");
				System.out.println("1. Agregar un producto");
				System.out.println("2. Mostrar la categoria del producto");
				System.out.println("3. Mostrar los datos del producto, categoria y la cantidad de cada articulo");
				System.out.println("4. Mostrar los datos del producto, categoría y la cantidad de cada artículo que el usuario tiene en su\r\n"
						+ "colección, ordenadas por tipo");
				System.out.println("5. Mostrar el producto y la categoría de todo el inventario");
				System.out.println("6. Mostrar el producto y la categoría existentes, ordenadas por tipo");
				
				switch (res) {
				case 1: {
				
				}break;
				
				case 2: {
					
				}break;
				
				case 3: {
					
				}break;
				
				case 4: {
					
				}break;
				
				case 5: {
					
				}break;
				
				case 6: {
					
				}break;
				
				}
				
				}while (res != 6);
			}break;
			}
		
		
		}while(opc != 3);
	}

}
