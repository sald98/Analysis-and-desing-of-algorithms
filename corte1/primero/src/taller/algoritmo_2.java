package taller;

import java.util.Scanner;

public class algoritmo_2 {
	
	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in); 
	System.out.println("ingrese un numero");
	
	 double n1=r.nextDouble();
	
	if(n1!=0) {
		double res=n1*Math.pow(n1, 3);
		System.out.println("la respuesta es:"+res );
		
		
	}else {
		
	}
}
}