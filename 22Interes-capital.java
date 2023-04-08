package Francisco;

import java.util.Scanner;

public class tarea22 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float c,inte;
		
		try {
		
		
		do {
		System.out.println("Ingrese el capital que desea prestar");
		c=tc.nextInt();
		} while (c<=0);
		if (c>=10000) {
			
			inte= (float) (c*0.07);
			System.out.println("La catidad de interes que se le aplicara a su prestamo de "+c+" Dolares es de = "+inte+" Dolares");
		}
		
		else if (c<10000) {
			
			inte = (float) (c*0.06);
			System.out.println("La catidad de interes que se le aplicara a su prestamo de = "+c+" Dolares es de = "+inte+" Dolares");
			
		}
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		

	}

}
