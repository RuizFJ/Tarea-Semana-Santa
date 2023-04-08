package Francisco;

import java.util.Scanner;

public class tarea44 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int n;
		
		try {
		do {
		System.out.println("Hola ingrese su edad");
		n=tc.nextInt();
		
		} while (n<0);
		if (n<13) {
			System.out.println("Usted es un niño");
		}
		
		else if (n>=13 && n<=24) {
			System.out.println("Usted es un joven");
		}
		
		else if (n>=25) {
			System.out.println("Usted es un adulto");
		}
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		

	}

}
