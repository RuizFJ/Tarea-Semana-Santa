package Francisco;

import java.util.Scanner;

public class tarea19 {

	public static void main(String[] args) {
		
		
		
		Scanner tc = new Scanner(System.in);
		
		int n;
		
		try {
		do {
		System.out.println("Hola bienvenido, por favor ingrese su edad");
		n=tc.nextInt();
		} while (n<=0);
		
		if (n>=18) {
			System.out.println("Felicidades, usted tiene el derecho de votar");
		}
		else if (n<18) {
			System.out.println("LO sentimos, usted no puede votar porque es menor de edad");
		}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
