package Francisco;

import java.util.Scanner;

public class tarea34 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner (System.in);
		
		try {
		int n,num = 0,x=0;
		do {
		System.out.println("¿Cúantos números desea ingresar");
		n=tc.nextInt();
		} while (n<=0);
		for (int i=1;i<=n;i++) {
			do {
			System.out.println("Ingrese el número "+i);
			num=tc.nextInt();
			} while (num<=0);
			x=(x*10)+num;
			
			
		} System.out.println("\n"+x);
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
