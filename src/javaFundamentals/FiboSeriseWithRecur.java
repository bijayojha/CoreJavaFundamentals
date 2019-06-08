package javaFundamentals;

import java.util.Scanner;

public class FiboSeriseWithRecur {
  // recursive declaration of method fibonacciSerise
  public static long fibonacciSerise(long number) {
    if ((number == 0) || (number == 1)) // base cases
      return number;
    else
      // recursion step
      return fibonacciSerise(number - 1) + fibonacciSerise(number - 2);
    
  }

  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Please enter the range within that, you want the Fibonic serise ");
	  long range=sc.nextInt();
	  long value;
	  
	  /**/
    for (int counter = 0; counter <range; counter++){
    	value= fibonacciSerise(counter);
    	
    	
    	/*In the below if conditions we are checking in each fibonic method call what is the actual value coming and then comparing with the max range value
    	 *  if */
      
    	if(value>range){  
    		System.out.println(); 
    		System.out.println("The next fibonic number is greater than the max range "+range+"\n"+"So exiting from the Loop by stopping here i.e"+"\n"+"Even Though I had set to run "+range+"	Times"+"\n"+"Since this Fibonic number crossed the Max limit"+"	I am stopping My execution on	"+counter+"'th  Iteration");
    		break;
    	  
      }
    	
    	System.out.print(+value+"	");
    }
  }
}