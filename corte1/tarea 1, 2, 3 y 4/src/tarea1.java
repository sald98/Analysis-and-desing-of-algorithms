import java.text.DecimalFormat;
import java.util.Scanner;

public class tarea1 {
	public static void main(String[] args) {
	   Scanner v=new Scanner(System.in);
       System.out.println("ingrese el valor de tiempo");
       int xt=v.nextInt();
       System.out.println("ahora, ingrese su velocidad media");
       int xv=v.nextInt();
       int l=12;
       float res;
              
      if(xt>=0){
          
          res=(xt*xv)/l;
          DecimalFormat tr= new DecimalFormat("#.000");
          System.out.println("los litros que se usaron fureon:");
          System.out.println(tr.format(res)); 
      }

}
}