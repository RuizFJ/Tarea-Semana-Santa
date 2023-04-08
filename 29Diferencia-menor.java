package Francisco;

import java.util.Scanner;

public class tarea29 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int n,n1,dif;
		
		try {
		do {
		System.out.println("Ingrese el primer numero");
		n=tc.nextInt();
		} while (n<=0);
		
		do {
		System.out.println("Ingrese el segundo valor");
		n1=tc.nextInt();
		} while (n1<=0);
		
		
		if (n>n1) {
			dif= n-n1;
			System.out.println("La diferencia que hay entre los 2 es de = "+dif);
		}
		else if (n<n1) {
			dif= n1-n;
			System.out.println("La diferencia que hay entre los 2 es de = "+dif);
		}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
