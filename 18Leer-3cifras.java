package Francisco;

import java.util.Scanner;

public class tarea18 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		int n,resul = 0,inver;
		try {
		do {
		System.out.println("Ingrese el numero que desea invertir");
		n=tc.nextInt();
		} while (n<100 || n>999);
		
		while (n>0) {
			
			inver= n%10;
			resul=(resul*10)+inver;
			n=n/10;
		}
		
		System.out.println("El número invertido es = "+resul);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		

	}

}
