package Francisco;

import java.util.Scanner;

public class tarea51 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		int n;
		do {
		System.out.println("Ingrese un número");
		n=tc.nextInt();
		} while(n<=0);
		
		
		if (n==2 && n==3) {
			System.out.println("El número es primo");
			
			
		} else if (n%2==0 && n%3==0) {
			System.out.println("El número no es primo");
		}else {
			System.out.println("El número es primo");
		}
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
