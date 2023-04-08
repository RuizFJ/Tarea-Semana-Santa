package Francisco;

import java.util.Scanner;

public class tarea62 {

	public static void main(String[] args) {
		


		
		
		Scanner tc = new Scanner(System.in);
		
		
		int n;
		int div=0,indi=0,suma=0;
		
		try {
		
		do {
		System.out.println("Para calcular un número perfecto, ingrese un número");
		n=tc.nextInt();
		} while (n<=0);
		
		
		for (int i=1;i<n;i++) {
			
			if (n%i==0) {
				div=i;
				suma = div + suma;
				if (suma==n) {
					
					System.out.println(n+" Es un número perfecto");
				} 
			}
		
		}  if (suma!=n) {
			System.out.println(n+" No es un numero perfecto");
		
		}
		
		} catch (java.util.InputMismatchException m) {
				System.out.println("Error el dato debe de ser numérico");
			}
				
		

	}

}
