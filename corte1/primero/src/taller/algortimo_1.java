package taller;

import java.util.Scanner;

public class algortimo_1 {
	
	
	public static void main(String[] args) {
	Scanner res= new Scanner(System.in); 
		
	String ar=res.next();
	
	if(ar=="pasta") {
		System.out.println("1) calentamos el agua");
		System.out.println("2) espramos a que caliente y ponemos los espaguetis");
		System.out.println("3) esperamos a que se vayan ablandando");
		System.out.println("4) empezamos a agregar condimentos para el sabor y textura");
		System.out.println("5) dejamos que se sequen un poco");
		System.out.println("6) servimos y listo!");
		
	}else if(ar!="pasta") {
		System.out.println("no se tiene esa receta");
	}else {
		System.out.println(""+ar);
	}

	}
}
