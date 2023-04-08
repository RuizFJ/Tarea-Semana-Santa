package Francisco;

import java.util.Scanner;

public class tarea10 {

	public static void main(String[] args) {
		

		
	Scanner tc = new Scanner(System.in);
		
		float f,m,a = 0;
		try {
		do {
		System.out.println("Ingrese la masa");
		m=tc.nextFloat();
		} while (m<=0);
		do {
			System.out.println("Ingrese la aceleración");
			a=tc.nextFloat();
			} while (a<=0);

		f = m*a;
		
		System.out.println("La fuera es de = "+f+" N");
		
		
		} catch (java.util.InputMismatchException j) {
			System.out.println("Error el dato tiene que ser numérico");
		}
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
