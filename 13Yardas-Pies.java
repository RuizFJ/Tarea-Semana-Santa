package Francisco;

import java.util.Scanner;

public class tarea13 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int opc;
		float yardas,pies,pulgadas,cm;
		
		try {
		System.out.println("¿Qué desea hacer = \n1 Convertir de Yardas a Cm \n2 Convertir de Pies a Cm \n3 Convertir de Pulgadas a Cm");
		opc=tc.nextInt();
		
		
		switch (opc){
		
		
		case 1 :
			do {
			System.out.println("Ingrese las Yardas");
			yardas=tc.nextFloat();
			} while (yardas<=0);
			cm = (float) (yardas * 91.44);
			System.out.println(yardas+ " Yardas Son = "+cm+" Cm");
			break ;
			
		case 2 : 
			do {
			System.out.println("Ingrese la cantidad de Pies ");
			pies=tc.nextFloat();
			} while (pies<=0);
			cm = (float) (pies * 30.48);
			System.out.println(pies+ " Pies son = "+cm+" Cm");
			break ;
		case 3 :
			do {
			System.out.println("Ingrese la cantidad de Pulgadas ");
			pulgadas=tc.nextFloat();
			} while (pulgadas<=0);
			cm = (float) (pulgadas * 2.54);
			System.out.println(pulgadas+ " Pulgadas son = "+cm+" Cm");
			break ;
			
			default : 
				System.out.println("Opción no válida");
		}
		
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
		
		
		
		

	}

}
