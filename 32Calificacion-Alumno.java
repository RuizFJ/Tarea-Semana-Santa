package Francisco;

import java.util.Scanner;

public class tarea32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner tc = new Scanner(System.in);
		
		int n;
		try {
		do {
		System.out.println("Ingrese su calificación");
		n=tc.nextInt();
		} while (n>=101 || n<0);
		
		
		if (n>=90) {
			System.out.println("Felicidades usted tiene una A");
		} else if(n>=80 && n<90) {
			System.out.println("Usted tiene una B");
		}else if (n>=70 && n<=79) {
			System.out.println("Usted tiene una C");
		}else if (n>=65 && n<=69) {
			System.out.println("Usted tiene una D");
		}else if (n<=64) {
			System.out.println("Usted tiene una E");
		}
			
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
