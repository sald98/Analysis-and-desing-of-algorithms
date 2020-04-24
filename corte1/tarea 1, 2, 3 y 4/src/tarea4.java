import java.util.Scanner;

public class tarea4 {
	public static void main(String[] args) {
	       Scanner e = new Scanner (System.in);
	       
	       System.out.println("ingrese los parametros de inicios del evento");
	       System.out.println("ingrese el dia(dd): ");
	       int dia=e.nextInt();
	       System.out.println(" ingrese hora(hh)");
	       double hora=e.nextDouble();
	       System.out.println("ingrese minutos(mm)");
	       double min=e.nextDouble();
	       System.out.println("ingrese segundos(ss)");
	       double seg=e.nextDouble();
	       
	        System.out.println("ahora, envie los parametros finales del evento con los mismos formatos correspondientes");
	        System.out.println("ingrese el dia");
	        double dia1=e.nextDouble();
	        System.out.println("ingrese la hora");
	        double hora1=e.nextDouble();
	        System.out.println("igrese los minutos");
	        double min1=e.nextDouble();
	        System.out.println("ingrese los segundos");
	        double seg1=e.nextDouble();
	       if(dia<=30){
	           
	            double res_dia=dia1-dia;  
	            double res_hora= hora1-hora;
	            if(hora1<hora){
	                
	            }    
	            double res_min=min1-min;
	            double res_seg=seg1-seg;
	                 
	           System.out.println("dias"+res_dia+"horas"+res_hora+"minutos"+res_min+"segundos"+res_seg);        
	       }else{ 
	           if(dia>30)
	           
	           System.out.println("error el mes no presenta mas dias");
	           
	       }
	    } 

}
