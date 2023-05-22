package repasoM03.ejemploPackage.tema2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Funciones {
	
	/**
	 * Metodo para imprimir por consola los numeros del 20 al 40
	 */
	public static void mostrarNumerosDel20Al40() {
		
		int contador = 20;
		// Mientras contador sea menor a 41 el bucle seguira iterando
		while(contador < 41) {
			System.out.println(contador); // Muestro por consola el valor de la variable contador
			contador++; // Modifico el valor de la variable contador con un operador unario que suma 1 a la variable contador
		}
		
	}
	
	/**
	 * Metodo para mostrar por consola los numeros del 50 al 30
	 */
	public static void mostrarNumerosDel50Al30() {
		
		for (int i = 50; i >= 30; i--) { // Voy restado 1 a i hasta llegar a 30
			System.out.println(i); // Imprimo por consola el valor de la variable i
		}
		
	}

	/**
	 * Metodo que muestra un menu y tiene todas las funcionalidades del programa
	 */
	public static void menu() {
		// Variable boleana para controlar el bucle do while
		boolean control = true;
		
		do {
			// Menu que se mostrara por consola al usuario
			System.out.println("Menu:\n"
					+ "1- muestra los números del 20 al 40 con un while.\n"
					+ "2- muestra los número del 50 al 30 con un bucle for.\n"
					+ "0- Finaliza el programa.");
			
			try {
				// Creo un objeto de la clase Scanner para leer y guardar los valores introducidos por el usuario
				Scanner sc = new Scanner(System.in);
				// Guardo el valor introducido por el usuario
				int opcion = sc.nextInt();
				
				// Compruebo que el valor introducido este dentro del rango permitido
				if(opcion > 2 || opcion < 0) {
					System.out.println("Estas fuera del rango permitido!!");
					continue; // Comenzamos una nueva iteracion
				}
				
				// Con una estructura de seleccion gestiono las diferentes opciones
				switch(opcion) {
					case 0:
						System.out.println("Bye, bye...");
						control = false; // Cambio el valor de la variable control a false para poder salir del bucle y finalizar el programa
					break;
					
					case 1:
						mostrarNumerosDel20Al40();
					break;
					
					case 2:
						mostrarNumerosDel50Al30();
					break;
				}
				
			} catch(InputMismatchException e) { // Controlo si el usuario no introduce un valor numérico
				System.out.println("Debes introducir valores numéricos.");
			}
			
			
		} while(control); // Mientras la variable control no sea igual a false el bucle seguira iterando
		
	}

}
