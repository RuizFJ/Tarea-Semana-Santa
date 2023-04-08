package Francisco;

import java.util.Scanner;

public class tarea01 {

	public static void main(String[] args) {
		
		Scanner tc= new Scanner(System.in);
		
		int h,b,a=0;
		try {
		do {
		System.out.println("Ingrese la altura del triángulo");
		h=tc.nextInt();
		}while (h<0);
		do {
		System.out.println("Ingrese la base del triángulo");
		b=tc.nextInt();
		}while ( b<0);
		
		a= (h*b)/2;
		
		
		System.out.println("El area del triangulo es = "+a+"\nSu altura es = "+h+"\nSu base es = "+b);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
