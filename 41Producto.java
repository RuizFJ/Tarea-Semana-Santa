package Francisco;

import java.util.Scanner;

public class tarea41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner tc = new Scanner(System.in);
		
		int n,prod = 1,n1;
		try {
		
		System.out.println("¿Cuántos numeros dese sacar el producto");
		n=tc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Ingrese el número "+i);
			n1=tc.nextInt();
			
			prod= n1 * prod;
			
			
		}System.out.println("El producto de los numeros ingresados es = "+prod);
		
		
		
		}catch (java.util.InputMismatchException j) {
			System.out.println("Error el dato tiene que ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
