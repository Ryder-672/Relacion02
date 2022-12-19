package Ejercicios;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce el lado1 ");
		int fila1 = teclado.nextInt();
		System.out.println("introduce la columna1: ");
		int col1 = teclado.nextInt();
		System.out.println("introduce el lado2: ");
		int fila2 = teclado.nextInt();
		System.out.println("introduce la columna2: ");
		int col2 = teclado.nextInt();
		
		if (fila1 == fila2) {
			System.out.println("estan en la misma fila");
		}else if (col1 == col2) {
			System.out.println("estan en la misma columna");
		}else if ((fila1-col1)==(fila2-col2)) {
			System.out.println("estan en la mimsa columna");
		}else if (((fila1+col1)==(fila2+col2))) {
			System.out.println("estan en la mimsa columna invertida");
		}
		
		teclado.close();
	}

}
