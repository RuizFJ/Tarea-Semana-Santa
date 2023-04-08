package Francisco;

import java.util.Scanner;

public class tarea24 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int a,y;
		try {
		do {
		System.out.println("Ingrese el valor de A");
		a=tc.nextInt();
		} while (a==0);
		
		if (a>0) {
			y=(int) Math.pow(2, a);
			System.out.println("Y = "+y);
		}
		else if (a<0) {
			y=a+5;
			System.out.println("Y = "+y);
		}
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
