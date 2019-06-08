package javaFundamentals;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo {
	
	public static void main(String[] args) throws IOException {
		
	    String calcOn=null;
	    Scanner sc = new Scanner(System.in);
	 
	    do{
						System.out.println("Please enter the values to perform arithimatic operation");
						int firstNumber=sc.nextInt();
						int secondNumber=sc.nextInt();	
						System.out.println("What operation you want to perform");
						
						switch((char)System.in.read()){
						
						case 43:
							
							System.out.println("the Addition of  "+firstNumber+" + "+secondNumber+"  =  "+ (firstNumber+secondNumber));
							break;
				
						case 45:
							
							System.out.println("the Substraction of  "+firstNumber+" - "+secondNumber+"  =  "+ (firstNumber-secondNumber));
							break;
						case 42:
							
							System.out.println("the multiplication of  "+firstNumber+" * "+secondNumber+"  =  "+ (firstNumber*secondNumber));
							break;
							
						case 47:
							
							System.out.println("the Division of  "+firstNumber+" / "+secondNumber+"  =  "+ (firstNumber/secondNumber));
							break;
						case 37:
							
							System.out.println("the Modulo of  "+firstNumber+" % "+secondNumber+"  =  "+ (firstNumber%secondNumber));
							break;
						default:
							break;
						}
						
						System.out.println("Do you want more calculation ? YES to proceed and NO to exit");
						calcOn=sc.next();
							   
	    }while(calcOn.equals("YES"));	
			
			
		
	}

}