package Francisco;

import java.util.Scanner;

public class tarea01 {

	public static void main(String[] args) {
		
		Scanner tc= new Scanner(System.in);
		
		int h,b,a=0;
		try {
		do {
		System.out.println("Ingrese la altura del rectángulo");
		h=tc.nextInt();
		}while (h<0);
		do {
		System.out.println("Ingrese la base del rectángulo");
		b=tc.nextInt();
		}while ( b<0);
		
		a= (h*b);
		
		
		System.out.println("El area del rectángulo es = "+a+"\nSu altura es = "+h+"\nSu base es = "+b);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
