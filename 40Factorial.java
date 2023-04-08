package Francisco;

import java.util.Scanner;

public class tarea40 {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		
		int n,facto=1; 
		try {
		do {
		System.out.println("Ingrese el numero que desea sacar el factorial");
		n=tc.nextInt();
		} while (n<0);
		for (int i=1;i<=n;i++) {
			facto=i*facto;
		}System.out.println("El factorial de "+n+" es = "+facto);
		
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
