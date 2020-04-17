package parcial;


import java.util.Scanner;


public class punto_P {
	public static void main(String[] args) {
		
		
		Scanner p= new Scanner(System.in);
		
		int n=p.nextInt();
		
		
		String[] a=new String[n];
		String[] b=new String[n];
		
		int p1=0,p2=0;
		String x;
		
		
		for(int  i=0;i<n;i++) {
			
			
			if((x/2)==0) {
				b[p2++]=x;
			}else {
				a[p1++]=x;
			}
			
		}
		
	    for(int i=0;i<p2;i++)
	    	System.out.println(+b[i]);
	        
	    for(int i=0;i<p1;i++)
	    	System.out.println(+b[i]);
	        
	    return ;
		
	}
}
