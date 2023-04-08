package Francisco;

import java.util.Scanner;

public class tarea21 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int n;
		try {
		System.out.println("Ingrese un numero");
        n=tc.nextInt();
        
        if (n<0) {
        System.out.println(Math.pow(n, 4));	
        
        }
        else if (n>=0) {
        	System.out.println(Math.pow(n, 2));
        	
        	
        }
		}
		 catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
