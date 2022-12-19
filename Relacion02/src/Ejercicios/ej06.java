package Ejercicios;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		double a1 = teclado.nextDouble();
		System.out.println("introduce otro numero: ");
		double b1 = teclado.nextDouble();
		System.out.println("introduce un ultimo numero: ");
		double c1 = teclado.nextDouble();
		
		System.out.println("introduce un numero: ");
		double a2 = teclado.nextDouble();
		System.out.println("introduce otro numero: ");
		double b2 = teclado.nextDouble();
		System.out.println("introduce un ultimo numero: ");
		double c2 = teclado.nextDouble();
		
		if ((a1/a2) != (b1/b2)) {
			
			if  ((a1/b1) == (-b2/a2)) {
				System.out.println("son rectas perpendiculares ");	
			}else {
				System.out.println("son rectas secantes");
			}
			
		}else if ((a1/a2) == (b1/b2)) {
			if ((a1/a2) == (b1/b2) && (a1/a2) == (c1/c2) && (b1/b2) == (c1/c2)) {
				System.out.println("son rectas coincidentes");
			}else {
				System.out.println("son rectas paralelas");
			}
		}
		
		
		teclado.close();
	}

}
