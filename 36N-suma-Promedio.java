package Francisco;

import java.util.Scanner;

public class tarea36 {

	public static void main(String[] args) {
		
		
         Scanner tc = new Scanner(System.in);
         try {
		int n;
	    float  n2,suma=0,prom=0;
	    
	    do {
	    
		System.out.println("¿Cúantas notas desea ingresar");
		n=tc.nextInt();
	    } while (n<=0);
		
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
