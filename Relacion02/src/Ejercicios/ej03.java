package Ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		float num1 = teclado.nextFloat();
		System.out.println("introduce otro numero: ");
		float num2 = teclado.nextFloat();
		System.out.println("introduce un ultimo numero: ");
		float num3 = teclado.nextFloat();
		
	
		if ((num1>num2) && (num1>num3)) {
			if (num2>num3) {
				System.out.println("el numero intermedio es "+num2);
			}else if (num3>num2) {
				System.out.println("el numero intermedio es "+num3);
			}

			
			
		}else if ((num2>num1) && (num2>num3)) {
			if (num1>num3) {
				System.out.println("el numero intermedio es "+num1);
			}else if (num3>num1) {
				System.out.println("el numero intermedio es "+num3);
			}
			
			
		}else if ((num3>num1) & (num3>num2)) {
			if (num1>num2) {
				System.out.println("el numero intermedio es "+num1);
			}else if (num2>num1) {
				System.out.println("el numero intermedio es "+num2);
			}
			
			
		}else {
			System.out.println("hay 2 que empatan");
		}

		teclado.close();
	}

}
