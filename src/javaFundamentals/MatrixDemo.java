package javaFundamentals;

import java.util.Scanner;

public class MatrixDemo {
static int matrixArray[][];
static Scanner sc;

public static void main(String[] args) {
	//int sumEleMtrx=0;
	MatrixDemo ob= new MatrixDemo();
	sc= new Scanner(System.in);
	System.out.println("Please enter the row size of the Matrix");
	int rowSize=sc.nextInt();
	System.out.println("Please enter the column size of the Matrix");
	int columnSize= sc.nextInt();
	matrixArray= new int[rowSize][columnSize];
	
	/*Methods to read the elements of the Matrix from command Line and stored those elements in an array which represents matrix*/
	
	ob.readDataForMatrixFromCommand(rowSize,columnSize);
	
	/*method  to read the elements from the matrix  and show them in the console */
	
	ob.showTheMatrixElement(rowSize,columnSize);
	
	/*method to show the sum of all elements in the matrix*/
	
	ob.showTheSumOfElementOfMatrix(rowSize,columnSize);
	
	/*Method to find the highest element in the matrix */
	
	ob.showTheHighestEleOfMatrix(rowSize,columnSize);
	
	/*Method to find the lowest element in the matrix */
	
	ob.showTheLowestEleOfMatrix(rowSize,columnSize);

}



/*Method implementation to read the data from command prompt and put those values in the array which represents  the Matrix*/
		
	void readDataForMatrixFromCommand(int rowSize,int columnSize){
		System.out.println("Please enter "+(rowSize)*(columnSize)+"  elements to the matrix");
			for(int row=0;row<rowSize;row++){
				System.out.println("Enter "+columnSize+" elements for the "+(row)+ " row");
				for(int col=0;col<columnSize;col++){
				
					matrixArray[row][col]=sc.nextInt();
					
					}
				}
			
	
		}
	
/*Method implementation to read the Matrix elements, i.e reading from the array*/
	
	void showTheMatrixElement(int rowSize,int columnSize){
		System.out.println("Please find the below matrix");
		for(int row=0;row<rowSize;row++){
			
			for(int col=0;col<columnSize;col++){
				
			System.out.print("	"+matrixArray[row][col]+" ");	
				
			}
			System.out.println();
		}
		
	}
	
	/*Method implementation to show sum of all the elements in the Matrix*/	
	void showTheSumOfElementOfMatrix(int rowSize,int columnSize){
		int sum=0;
		
		for(int row=0;row<rowSize;row++){
			
			for(int col=0;col<columnSize;col++){
				
				sum= sum+matrixArray[row][col];	
				
			}
		}
		System.out.println("The sum of each elements in the matrix is =  "+sum);
		
	}
	
	/*Method implementation to find the highest number in the Matrix*/
	
	void showTheHighestEleOfMatrix(int rowSize,int columnSize){
		int highest=matrixArray[0][0];
		
		for(int row=0;row<rowSize;row++){
			
			for(int col=0;col<columnSize;col++){
				
				if(matrixArray[row][col]>=highest){
				
					highest=matrixArray[row][col];	
				}
			}
		}
		System.out.println("The higest  elements in the matrix is =  "+highest);
		
	}
	
	
/*Method implementation to find the Lowest number in the Matrix*/
	
	void showTheLowestEleOfMatrix(int rowSize,int columnSize){
		int lowest=matrixArray[0][0];
		
		for(int row=0;row<rowSize;row++){
			
			for(int col=0;col<columnSize;col++){
				
				if(matrixArray[row][col]<=lowest){
				
					lowest=matrixArray[row][col];	
				}
			}
		}
		System.out.println("The Lowest  elements in the matrix is =  "+lowest);
		
	}
	
}