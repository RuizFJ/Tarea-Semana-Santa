package Francisco;

import java.util.Scanner;

public class tarea06 {

	public static void main(String[] args) {
		
		
		
		Scanner tc= new Scanner(System.in);
		
		float kg,l=0 ;
		try {
		do {
		System.out.println("Ingrese los kg que desea convertir");
		kg=tc.nextFloat();
		} while (kg<0);
		
		l=(float) (kg*2.205);
		
		System.out.println(kg+" Kg son = "+l+" libras");
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		

	}

}
