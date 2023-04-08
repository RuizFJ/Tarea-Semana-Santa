package Francisco;

import java.util.Scanner;

public class tarea30 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int x,y;
		 float suma=0,suma2=0;
		 try {
		do {
		System.out.println("Ingrese el primer número");
		x=tc.nextInt();
		} while (x==0);
		do {
		System.out.println("Ingrese el segundo número");
		y=tc.nextInt();
		} while (y==0);
		if (x<0 && y<0) {
			
			suma= (int) (Math.pow(x, 2) + Math.pow(y, 2));
			System.out.println(suma);
		}
		else if (x<0 && y>0) {
			suma=y+x;
			System.out.println(suma);
			
		} else if (x>0 && y<0) {
			suma = (float)  x/y;
			System.out.println(suma);
			
		} else if (x>0 && y>0) {
		if (x>y) {
			suma= x+y;
			System.out.println(suma);
		} else if (x<y) {
			System.out.println(Math.sqrt(x));
		}
		}
		
} catch (java.util.InputMismatchException m) {
	System.out.println("Error el dato debe de ser numérico");
}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
