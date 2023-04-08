package Francisco;

import java.util.Scanner;

public class tarea12 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		int n;
		float prom = 0,notas,suma = 0;
		
		try {
		do {
		System.out.println("¿Cuántas notas desea sacar?");
		n=tc.nextInt();
		} while (n<=0);
		
		for (int i=1;i<=n;i++) {
			
		do {
			System.out.println("Ingrese la nota = "+i);
			notas=tc.nextFloat();
		} while (notas<0);	
			suma = notas + suma;
			prom = suma/n;
		
		
		}System.out.println("El promedio de sus "+n+" notas es = "+prom);
		
		
	} catch (java.util.InputMismatchException m) {
		System.out.println("Error el dato debe de ser numérico");
	}
	
		
		
		
		
		
		
		
		

	}

}
