package Francisco;

import java.util.Scanner;

public class tarea09 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float r,v,h,ab;
		try {
		do {
		System.out.println("Ingrese el radio del cilindro");
		r=tc.nextFloat();
		} while (r<=0);
		do {
		System.out.println("Ingrese la altura del cilindro");
		h=tc.nextFloat();
		} while (h<=0);
		ab=(float) (Math.PI*(r*r));
		
		v= ab*h;
		
		System.out.println("El volumen del cilindro es = "+v+" u^3");
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		

	}

}
