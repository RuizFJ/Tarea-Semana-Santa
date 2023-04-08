package Francisco;

import java.util.Scanner;

public class tarea45 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		int n,prom=0,suma=0,max = 0,min = 0,volt;
		try {
		do {
		System.out.println("¿Cuántos voltajes desea ingresar");
		n=tc.nextInt();
		} while (n<=0);
		
		for(int i=1;i<=n;i++) {
			do {
			System.out.println("Ingrese el voltaje "+i);
			volt=tc.nextInt();
			} while (volt<=0);
			suma=volt+suma;
			prom=suma/n;
			
			if (i==1) {
				min = volt;
				
			} else if (volt<min) {
				min=volt;
			}
			max = volt;
			
		}System.out.println("El promedio es = "+prom+"\nEl maximo es = "+max+"\nEl minimo es = "+min);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
