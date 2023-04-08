package Francisco;

import java.util.Scanner;

public class tarea42 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int n,num = 0,suma=0,mostrar=0;
		
		try {
		System.out.println("¿Cuántos números dese ingresar");
		n=tc.nextInt();
		
		for (int i=1;i<=n;i++) {
			
			System.out.println("Ingrese el número "+i);
			num=tc.nextInt();
			
		 if (num > 0) {
			suma = num + suma;
		
		
		}else if (num<=0) {
			mostrar ++;
		}
		 
		} System.out.println("La suma de los números positivos es = "+suma+"\nLa cantidad de numeros negativos o ceros son = "+mostrar);

		} catch (java.util.InputMismatchException j) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		
	}

}
