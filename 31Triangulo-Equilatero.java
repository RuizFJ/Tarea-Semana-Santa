package Francisco;

import java.util.Scanner;

public class tarea31 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int a,b,c;
		
		try {
		do {
		System.out.println("Ingrese la medida del lado A");
		a=tc.nextInt();
		} while (a<=0);
		
		do {
		System.out.println("Ingrese la medida del lado B");
		b=tc.nextInt();
		} while (b<=0);
		
		do {
		System.out.println("Ingrese la medida del lado C");
		c=tc.nextInt();
		} while (c<=0);
		
		
		if (a==b && b==c) {
			System.out.println("El triangulo es equilátero");
		}
		else if(a!=b && b!=c && a!=c) {
		System.out.println("El triangulo es escaleno");
		
		}	else {
			System.out.println("El triangulo es isósceles");
		}
				
		
		}catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
