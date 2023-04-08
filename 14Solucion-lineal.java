package Francisco;

import java.util.Scanner;

public class tarea14 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		float a,b;
		float x=0;
		try {
		do {
		System.out.println("Ingrese a");
		a= tc.nextInt();
		} while (a==0);
		System.out.println("Ingrese b");
		b=tc.nextInt();
		
		x=(b*-1)/a;
				
		System.out.println(x);		
				
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		

	}

}
