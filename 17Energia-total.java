package Francisco;

import java.util.Scanner;

public class tarea17 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		
	 float m,h,v,g=(float) 9.8,Ec,Ep,Et;
	 
	 try {
	 do {
	 System.out.println("Para calcular la energia total ingrese la masa de cuerpo (kg)");
		m=tc.nextFloat();
	 } while (m<=0);
		
	 do {
		 System.out.println("Ingrese la velocidad del cuerpo (M/s^2)");
			v=tc.nextFloat();
		 } while (v<=0);
		
	 do {
		 System.out.println("Ingrese la altura que se encuentra el objeto (M)");
			h=tc.nextFloat();
		 } while (h<=0);
		
		Ec= (m*(v*v))/2;
	 
	 Ep= (m*g)*h;
	 
	 Et= Ec+Ep;
	 
	 System.out.println("La energia total almacenada en un cuerpo es = "+Et+" J");
	 
	 
	 }  catch (java.util.InputMismatchException s) {
			System.out.println("Error el dato debe de ser numérico");
		}
	}

}
