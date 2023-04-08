package Francisco;

import java.util.Scanner;

public class tarea02 {

	public static void main(String[] args) {
		
		
		Scanner tc= new Scanner(System.in);
		
		
	float r,p=0,a=0;
	try {
	do {
	System.out.println("Ingrese el radio del circulo");
	r=tc.nextFloat();
	} while (r<0);
	
	p=(float) (2*Math.PI*r);
	
	a=(float) (Math.PI*(r*r));
	
	System.out.println("El area del circulo es = "+a+"\nEl perimetro de la circunferencia es = "+p);
	
	} catch (java.util.InputMismatchException m) {
		System.out.println("Error el dato tiene que ser numérico");
	}
		
		
		
		
		
		
		
		
		
		
	}

}
