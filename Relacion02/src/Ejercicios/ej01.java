package Ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		int num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Ambos numeros son iguales ");
		}else if (num1>num2) {
			System.out.println("el primer numero es mayor que el segundo");
		}else {
			System.out.println("el segundo numero es mayor que el primero");
		}
		
		teclado.close();
	}

}
