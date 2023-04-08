package Francisco;

import java.util.Scanner;

public class tarea05 {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		
		double x,y=0;
		
		try {
		do {
		System.out.println("Ingrese el valor de X");
		x=tc.nextDouble();
		} while (x<0);
		
		y= (5*(Math.pow(x, 4))+ 2*(Math.pow(x, 3)) + 3*(Math.pow(x, 2)))+7 ;
		
		System.out.println("El valor de f(x) es = " +y);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
