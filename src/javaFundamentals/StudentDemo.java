package javaFundamentals;

import java.util.Scanner;

class Student {
	
	int rollNumber;
	String name;
	String deptName;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}




public class StudentDemo{
	 
	 
	 public static void main(String args[]){
		 int numberOfObject;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Please enter how many object you want to print");
		 numberOfObject= sc.nextInt();
		 Student ArrToStoreStudentObj[]= new Student[numberOfObject];
		// Student ArrToSortStudentObj[] = new Student[numberOfObject];
		 
		 for (int i = 0; i < numberOfObject; i++) {
			 System.out.println("Please provide Details of Object : "+(i+1));
			 Student stdobj= new Student();
			 stdobj.setRollNumber(sc.nextInt());
			 stdobj.setName(sc.next());
			 stdobj.setDeptName(sc.next());
			 ArrToStoreStudentObj[i]=stdobj;
			
		}
		 
		 System.out.println("Below are the object details");
		 for (int i = 0; i < ArrToStoreStudentObj.length; i++) {
			System.out.println("OBJECT "+(i+1)+" : "+"Roll Number ==  "+ArrToStoreStudentObj[i].getRollNumber()+"	  Name  == "+ArrToStoreStudentObj[i].getName()+"	Department Name ==  "+ArrToStoreStudentObj[i].getDeptName());
			
		}
		 
		 // logic to print the student objects in an order.
		 for (int i = 0; i < ArrToStoreStudentObj.length; i++) {
			for (int j = i+1; j < ArrToStoreStudentObj.length; j++) {
				
				if(ArrToStoreStudentObj[i].getRollNumber()>ArrToStoreStudentObj[j].getRollNumber())
					{
						Student stdobjTemp= new Student();
						stdobjTemp=ArrToStoreStudentObj[i];
						ArrToStoreStudentObj[i]= ArrToStoreStudentObj[j];
						ArrToStoreStudentObj[j]=stdobjTemp;
					}
				
			}
		}
		 
		 // printing the sorted student objects
		 
		 System.out.println("Below are the sorted object details");
		 
		 
		 for (int i = 0; i < ArrToStoreStudentObj.length; i++) {
				System.out.println("OBJECT "+(i+1)+" : "+"Roll Number ==  "+ArrToStoreStudentObj[i].getRollNumber()+"	  Name  == "+ArrToStoreStudentObj[i].getName()+"	Department Name ==  "+ArrToStoreStudentObj[i].getDeptName());
				
			}
		
		 
		 
	 }
}
