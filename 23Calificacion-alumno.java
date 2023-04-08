package Francisco;

import java.util.Scanner;

public class tarea23 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float n;
		try {
		do {
		System.out.println("Hola estudiante ingrese su nota");
		n=tc.nextFloat();
		
		} while (n<0 || n>100);
		
		if (n>=60) {
			System.out.println("Felicidades usted está aprobado");
		}
		
		else if (n<=59) {
			System.out.println("Lo sentimos, usted está reprobado");
		}
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		

	}

}
