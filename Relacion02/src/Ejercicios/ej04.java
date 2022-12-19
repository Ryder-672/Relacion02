package Ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		int num2 = teclado.nextInt();
		System.out.println("introduce un ultimo numero: ");
		int num3 = teclado.nextInt();
		
		if ((num1+num2) > num3) {
			if ((num1+num3) > num2) {
				if ((num2+num3) > num3) {
					System.out.println("es posible hace un triangulo con esos lados");
				}
			}
		} else {
			System.out.println("no hay triangulos con esas dimensiones");
		}
		
		teclado.close();
	}

}
