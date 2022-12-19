package Ejercicios;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		float num1 = teclado.nextFloat();
		System.out.println("introduce otro numero: ");
		float num2 = teclado.nextFloat();
		System.out.println("introduce la operacion a realizar");
		String operador = teclado.next();
		
		switch (operador) {
		case "suma": System.out.println("operador suma: "+num1+"+"+num2+"="+(num1+num2));
			break;
		case "resta": System.out.println("operador resta: "+num1+"-"+num2+"="+(num1-num2)); 
			break;
		case "multiplica": System.out.println("operador multiplicacion: "+num1+"-"+num2+"="+(num1*num2)); 
			break;
		case "divide": System.out.println("operador multiplicacion: "+num1+"-"+num2+"="+(num1/num2)); 
			break;
		case "raiz": System.out.println("operador multiplicacion: "+num1+"-"+num2+"="+(Math.sqrt(num1))); 
			break;
		case "eleva": System.out.println("operador multiplicacion: "+num1+"-"+num2+"="+(Math.pow(num1, num2))); 
			break;
		}
		
		teclado.close();
		
	}

}
