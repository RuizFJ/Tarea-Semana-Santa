package Francisco;

import java.util.Scanner;

public class tarea35 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
	    float  n=3,n2,suma=0,prom=0;
		try {
		for (int i =1;i<=n;i++) {
			do {
			System.out.println("Ingrese el número "+i);
			n2=tc.nextFloat();
			} while (n2<=0);
			suma= n2+suma;
			prom=suma/n;
			
			
			
			
			
		}System.out.println("La suma es = "+suma+"\nEl promedio es = "+prom);
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
