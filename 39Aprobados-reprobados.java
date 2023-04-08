package Francisco;

import java.util.Scanner;

public class tarea39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner tc = new Scanner(System.in);
         try {
		int n,apro = 0,repro = 0;
	    float  n2,prom=0;
	    
	    do {
	    
		System.out.println("¿Cúantas notas de estudiantes desea ingresar");
		n=tc.nextInt();
	    } while (n<=0);
		
		for (int i =1;i<=n;i++) {
			do {
			System.out.println("Ingrese la nota del estudiante número "+i);
			n2=tc.nextFloat();
			} while (n2<0 || n2>100);
			
			if (n2>=60) {
				apro++;
			}else if (n2<60) {
				repro++;
			}
			
			
			
			
			
		}System.out.println(apro+" Está/n aprobados y "+repro+" está/n reprobados");
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
	}

}
