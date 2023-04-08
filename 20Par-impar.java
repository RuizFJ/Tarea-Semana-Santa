package Francisco;

import java.util.Scanner;

public class tarea20 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		int n;
		try {
		do {
		System.out.println("Ingrese un numero");
		n=tc.nextInt();
		} while (n<=0);
		if (n%2==0) {
			System.out.println("El numero ingresado es par");
		} 
		else if (n%2!=0) {
			System.out.println("El numero ingresado es impar");
		}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
