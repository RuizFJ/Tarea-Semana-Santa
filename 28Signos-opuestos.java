package Francisco;

import java.util.Scanner;

public class tarea28 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int n,n1;
		try {
		do {
		System.out.println("Ingrese el primer número");
		n=tc.nextInt();
		} while (n==0);
		do {
		System.out.println("Ingrese el segundo número");
			n1=tc.nextInt();
		} while (n1==0);
			
			
			
			if (n<0 && n1>0) {
			System.out.println("Signos opuestos");
		
			} else if (n>0 && n1<0){
				System.out.println("Signos opuestos");
			} else {
				System.out.println(".");
			}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		

	}

}
