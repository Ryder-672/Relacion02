package Ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce tu salario ");
		double salario = teclado.nextDouble();
		System.out.println("introduce cuantos hijos tienes: ");
		int hijos = teclado.nextInt();
		
		double impuesto;
		double descuento;
		
		if (salario<=1000 ) {
			System.out.println("el salario se queda en:"+salario+" no se le aplican descuentos ni impuestos");
			
		}else if (salario>1000 && salario<=1600) {
			impuesto=(salario*5)/100;
			descuento = (hijos*1)/100.0;
			if (descuento>=0.05) {
				descuento = 0.05;	
			}
			salario = (salario - impuesto) + (salario * descuento); 
			System.out.println("el salario se queda en: "+salario);
			
		}else if (salario>1600 && salario<=3000) {
			impuesto=(salario*10)/100;
			descuento = (hijos*1)/100.0;
			if (descuento>=0.05) {
				descuento = 0.05;	
			}
			salario = (salario - impuesto) + (salario * descuento); 
			System.out.println("el salario se queda en: "+salario);
			
		}else if (salario>3000 && salario<=4600) {
			impuesto=(salario*15)/100;
			descuento = (hijos*1)/100.0;
			if (descuento>=0.05) {
				descuento = 0.05;	
			}
			salario = (salario - impuesto) + (salario * descuento);  
			System.out.println("el salario se queda en: "+salario);
			
		}else {
			impuesto=(salario*20)/100;
			descuento = (hijos*1.5)/100.0;
			if (descuento>=0.10) {
				descuento = 0.10;	
			}
			salario = (salario - impuesto) + (salario * descuento); 
			System.out.println("el salario se queda en: "+salario);
			
		}
		
		teclado.close();
	}

}
