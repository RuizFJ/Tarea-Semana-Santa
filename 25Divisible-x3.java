package Francisco;

import java.util.Scanner;

public class tarea25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
		
		int n;
		try {
		do {
		System.out.println("Ingrese un número");
		n=tc.nextInt();
		} while (n<=0);
		
		if (n%3==0) {
			System.out.println("El numero ingresado es divisible por 3");
		} else if (n%3!=0) {
			System.out.println("El numero ingresado no es divisile por 3");
		}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
