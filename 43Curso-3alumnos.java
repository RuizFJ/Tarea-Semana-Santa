package Francisco;

import java.util.Scanner;

public class tarea43 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float n1,n2,n3,suma = 0,prom = 0;
		int estu=25,nota=3;
		String nombre = null;
		
		try {
		
		for (int i=1;i<=estu;i++) {
			
			System.out.println("Hola bienvenido querido estudiante, ingrese su nombre "+i);
			nombre=tc.next();
			for (int j=1;j<=nota;j++) {
				
				do {
				System.out.println("Ingrese la nota "+j);
				n1=tc.nextFloat();
				} while (n1<0);
				suma= n1+suma;
				prom = suma/nota;
			}System.out.println(nombre+" su promedio es de = "+prom);
		}
		
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
