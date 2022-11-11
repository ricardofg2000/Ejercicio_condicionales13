package unico;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/* Realiza un programa que diga si un número 
		 * introducido por teclado es par y/o divisible entre 5.*/
		
		Scanner leer = new Scanner(System.in);
		
		String mensajePar;
		String mensajeDiv5;
		int num;
		
		System.out.println("Este programa le indicará si un número es par y/o divisible entre 5");
		System.out.println("Introduzca un número");
		num = leer.nextInt();
		
		if (num % 2 == 0) {
			mensajePar = "Si es par";
		}
		else {
			mensajePar = "No es par";
		}
		if (num % 5 == 0) {
			mensajeDiv5 = "Si es divisible entre 5";
		}
		else {
			mensajeDiv5 = "No es divisible entre 5";
		}
		
		System.out.println(mensajePar);
		System.out.println(mensajeDiv5);
		
	}

}
