package Francisco;

import java.util.Scanner;

public class tarea08 {

	public static void main(String[] args) {
           
		
		Scanner tc = new Scanner(System.in);
        float a,b,c,s,s2,area;
        
        
        
        try {
		do {
		System.out.println("Ingrese el lado A");
		a=tc.nextFloat();
		} while (a<=0);
		do {
		System.out.println("Ingrese el lado B");
		b=tc.nextFloat();
		} while (b<=0);
		do {
		System.out.println("Ingrese el lado C");
		c=tc.nextFloat();
		} while (c<=0);
		s= (a+b+c)/2;
		
		s2= s*(s-a)*(s-b)*(s-c);
		area= (float) Math.sqrt(s2);
		
		System.out.println("El area del triangulo es = "+area+" U^2");
		
        } catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numérico");
		}
		
		
		
		
	}

}
