package Francisco;

import java.util.Scanner;

public class tarea03 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		int x,x1=2;
		float c=(float) 2.5,y=0,y1=0;
		try {
		System.out.println("Ingrese el valor de X");
		x=tc.nextInt();
		
		
		y=(x1*c)-2;
		y1=(x*c)-2;
		
		
		
		System.out.println("El valor de ¨Y¨ cuando X vale 2 es ="+y + "\nEl valor de ¨Y¨ cuando X vale "+x+" es = "+y1);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
