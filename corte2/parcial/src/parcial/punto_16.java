package parcial;

public class punto_16 {

	public static void main(String[] args) {
		
		String str;
		int a;
		while (a==0) {
			int parte;
			a=parte;
			int contar=0, ciclos=0;
			boolean R=false;
			for(int i=0;i<str.length();i++) {
				
				if(str[i]=='W') {
					if(R && contar>0) {
						ciclos+=1;
						contar=0;
						R=false;
						
					}else {
						R=true;
						contar++;
						if(contar==parte) {
							ciclos+=1;
							contar=0;
						}
					}
				}
				if(contar>0) {
					ciclos+=1;
					System.out.println(+ciclos);
				} 
				
			}
			
			
			
			
			
		}
		 return ;
		
		

	}

}
