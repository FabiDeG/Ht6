package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {

	public Products(String titulo, String contenido) {
		// TODO Auto-generated constructor stub
	}

	public static void sacarPro(String[] args) throws FileNotFoundException {
		
		String archivo = "ListadoProducto (2).txt";
		File arch = new File(archivo);
		Scanner scanner = new Scanner(arch);
		String pro = "";
		pro = scanner.nextLine();
				
		List<Products> productos = new ArrayList<>(); // almacena los elementos
		String[] datos = pro.split("\\|"); // separar "|"
		String titulo = datos[0];
		String contenido = datos[1];
		Products producto = new Products(titulo, contenido);
		productos.add(producto); // añadir el objeto a la lista
        

	}

}
