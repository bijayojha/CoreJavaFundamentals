package javaFundamentals;

import java.util.Scanner;

public class FiboSeriseDemoRecur1 {
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
    	System.out.println(+value+"	");
    }
  }
}