import java.text.DecimalFormat;
import java.util.Scanner;

public class tarea2 {
	public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        
        
        
        System.out.println("ingrese por favor ingrse los valores:");
        System.out.println("valor de A:");
        float A=aa.nextFloat();
        System.out.println("valor de B:");
        float B=aa.nextFloat();
        System.out.println("y valor de C");
        float C=aa.nextFloat();
        DecimalFormat tr= new DecimalFormat("#.000");
        
        
       //if(A==null){
            //case 1{
                //(area triangulo rectangulo A y C)
                
                float res_trire=(A*C)/2;
                System.out.println("el area del triangulo rectangulo es:");
                System.out.println(tr.format(res_trire));
            
            //}
            //case 2{
                //(area de un circulo)
                float  res_ac;
                res_ac=(float) (Math.PI*(C*C));
                System.out.println("el area de un circulo es:");
                System.out.println(tr.format(res_ac));
            //}
              
            //case 3{
                //(area de un trapesio con (a,b como bases) y c con altura)
                
                //float= res_tra;
                
               float res_tra=(((A+B)/2)*C);
               
                System.out.println("el area de un trapsesio es:");
                System.out.println(tr.format(res_tra));
                
                
            //}
            //case 4{
                //(area de un cuadrado B)
                
                float res_cua=B*B;
                
                System.out.println("el area de el cuadrado es:");
                System.out.println(tr.format(res_cua));
                
                
                
            //}
            //case 5
                //(area de rectangulo A y B)
                    
                    
                float res_rec=A*B;
                
                System.out.println("el area de un rectangulo es:");
                System.out.println(tr.format(res_rec));
            
            //}
            
            
        }

		
		
		
		
		
		
		
	}

