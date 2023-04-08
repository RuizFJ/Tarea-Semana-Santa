package Francisco;

import java.util.Scanner;

public class tarea04 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float n = 0;
		try {
		do {
		System.out.println("Ingrese el número que desea sacar raiz cuadrada");
		n=tc.nextFloat();
		} while (n<0);
		
		System.out.println("La raiz cuadrada es = "+Math.sqrt(n));
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		

	}

}
