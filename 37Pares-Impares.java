package Francisco;

import java.util.Scanner;

public class tarea37 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		int n,num,pares =0 ,impar=0;
		
		try {
		
		do {
		System.out.println("¿Cuántos numeros desea ingresar?");
		n=tc.nextInt();
		} while(n>=0);
		
		for (int i=1;i<=n;i++) {
			do {
			System.out.println("Ingrese el numero "+i);
			num=tc.nextInt();
			} while (num<=0);
			if (num%2==0) {
				pares++;
			} else if (num%2!=0) {
				impar++;
			}
			
				
		}System.out.println("Hay "+pares+" numeros pares y "+impar+" impares");
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
