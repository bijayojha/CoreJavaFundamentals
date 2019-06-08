package javaFundamentals;

public class PowerOfNumDemo {
 
	
	long  findPowerOf(long base1,long exponent1){
		long result=1;
		long base=base1;
		long exponent= exponent1;
		
		for(int i=0;i<exponent;i++){
			
			result=result*base;
		}
		
		return result;
		
	}

}