package parcial;
import java.util.Scanner;




public class punto_A {
int [1001]a=new int[];

public static void frecuencia() {
	
	int [0]a= new int[3];
	int [1]a= new int[1];
	
	for(int i=2;i<=1000;i++) {
		int contar=2;
		for(int j=2;j<=(i/2);j++) {
			if(i%j==0) {
				contar++;
			}
		}
	}
	
}

public static void main(String[] args) {
	int [1001]a=new int[];
	Scanner ac = new Scanner(System.in);
	


	int frecuencia;
	int testeo=ac.nextInt();
	
	
	int numero;
	while(testeo--) {
		int numero1=ac.nextInt();
		int contar=1;
		for(int i=3;i<=numero1;i++) {
			if(a[i]/2==0) {
				contar++;
			}
		}System.out.println("%d\n"+contar);
	}return ;

	
	}

}

