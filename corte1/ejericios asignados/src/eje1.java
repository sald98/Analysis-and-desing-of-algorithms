import java.util.Scanner;

public class eje1 {

	public static void main(String[] args) {
		Scanner mp= new Scanner(System.in);
	       
	       int cp;
	       int qp;
	       
	       double pr1=1.50,pr2=2.50,pr3=3.50,pr4=4.50,pr5=5.50;
	       double res,res1,res2,res3,res4,res5;
	       
	        System.out.println("ingrese la cantidad:");
	        cp=mp.nextInt();
	        //switch(cp>=1 && cp<=5){
	            System.out.println("ingrese el producto (recuerde solo existen 1001 al 1005)");
	            qp=mp.nextInt();
	               
	                //case1()
	                
	            if(cp>=1&&cp<=5){    
	            
	                if(qp==1001){
	                    res1=cp*pr1 ;
	                System.out.println(""+res1);
	                }else{
	                if(qp==1002){
	                     res2=cp*pr2 ;
	                System.out.println(""+res2);     
	                }else{
	                
	                if(qp==1003){
	                    res3=cp*pr3 ;
	                System.out.println(""+res3);
	            
	                    }else{
	                if(qp==1004){
	                     res4=cp*pr4 ;
	                System.out.println(""+res4);
	                }else{
	                if(qp==1005){
	                      res5=cp*pr5 ;
	                System.out.println(""+res5);
	                }
	                }
	                }                
	                } 
	                }
	                
	                }
	}

	}


