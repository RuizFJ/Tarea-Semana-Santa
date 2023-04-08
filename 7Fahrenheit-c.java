package Francisco;

import java.util.Scanner;

public class tarea07 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		float f,c;
		try {
		
		System.out.println("Ingrese los grados Fahrenheit que desea convertir");
		f=tc.nextFloat();
		
		c=(f-32)*(5)/9;
		
		System.out.println(f+" Fahrenheit = "+c+" Celsius");
		
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
