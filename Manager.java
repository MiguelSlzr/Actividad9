package Actividad9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {
	
	public void ejecutar(){
		Splitter miSplit = new Splitter();
		Fibonacci miFibonacci = new Fibonacci();
		miSplit.splitFibonacci();
		
		File file;
		String path;

		FileWriter escribir = null;
		PrintWriter imprimir = null;
			
			String directoryPath = "C:\\Users\\PC\\eclipse-workspace\\Bloque3\\src\\Actividad9\\";
			String ext = "Fibonacci.txt";
			path = directoryPath+ext;
			file = new File(path);
			
			if (file.exists()) {

				System.out.print("Ya existe el archivo \n");
				System.out.println(file.getParent());
				
			} else {
				System.out.print("Creando archivo con la serie de Fibonacci, sus pares y sus impares: ");
				try {
				
					file.createNewFile();
					escribir = new FileWriter(file);
					imprimir = new PrintWriter(escribir);
					
					imprimir.print("Números de la serie de Fibonacci: \n");
					imprimir.print(miFibonacci.serieFibonacci());
					imprimir.print("\n\nNúmeros pares de la serie de Fibonacci: \n");
					imprimir.print(miSplit.paresFibonacci);
					imprimir.print("\n\nNúmeros impares de la serie de Fibonacci: \n");
					imprimir.print(miSplit.imparesFibonacci);
					
				
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally{
					try {
						escribir.close();
						imprimir.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}	
				
			}
	}
}