package Ejercicios;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un año: ");
		int anio = teclado.nextInt();
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
		
				System.out.println("es bisiesto");
		}else {
				System.out.println("no es bisiesto");
			}
		
		teclado.close();
	}

}
