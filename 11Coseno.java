package Francisco;

import java.util.Scanner;

public class tarea11 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		double n;
		try {
		System.out.println("Ingrese el numero que desea sacar coseno");
		n=tc.nextFloat();
		
		
		System.out.println("El resultado es = "+Math.cos(n));
		
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		

	}

}
