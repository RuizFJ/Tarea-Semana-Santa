package Francisco;

import java.util.Scanner;

public class tarea27 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int n,n2=10,p=12,suma=0;
		try {
		do {
		System.out.println("Ingrese la cantidad de pantalones que desea comprar");
		n=tc.nextInt();
		} while (n<=0);
		if(n<=3) {
			
			suma= n*p;
			System.out.println("El costo de "+n+" pantalon/es es = "+suma+" Dolares");
			
		} else if (n>3) {
			
			suma = n*n2;
			System.out.println("El costo de "+n+" pantalones es = "+suma+" Dolares");
		}

		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
