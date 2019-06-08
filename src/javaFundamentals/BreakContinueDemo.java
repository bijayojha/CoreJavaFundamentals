package javaFundamentals;

public class BreakContinueDemo {

	public static void main(String[] args) {
		
		
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				if(i==j){
				//break ;
				continue  ;
				}
				System.out.println(i+"-------------------------"+j);
			}
			
		}
	}

}