package Francisco;

import java.util.Scanner;

public class tarea50 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		int n;
		int div=0,indi=0,suma=0;
		
		try {
		
		do {
		System.out.println("Ingrese un número");
		n=tc.nextInt();
		} while (n<=0);
		
		
		System.out.println("Los números divisibles de "+n+" son");
		for (int i=1;i<=n;i++) {
			
			if (n%i==0) {
				div=i;
				System.out.println(div);
				
			}
			else if  (n%i!=0){
			indi=i;	
			
				
			}
		
		}
		
		} catch (java.util.InputMismatchException m) {
				System.out.println("Error el dato debe de ser numérico");
			}
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
