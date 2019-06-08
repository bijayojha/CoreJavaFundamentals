package interview;

import java.util.Scanner;

public class ArrayToPolulateStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Student you want to store ?");
		int numOfStudent=sc.nextInt();
		Student []studentArray=new Student[numOfStudent];
		Student student=null;
		
		//Insert values to the student array
		
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("Enter the Student "+(i+1)+" Details");
			student=new Student();
			System.out.println("Student ID");
		
			student.setStudentId(sc.nextInt());
			System.out.println("Student First Name");
			student.setStudentFname(sc.next());
			System.out.println("Student last Name");
			student.setStudentLname(sc.next());
			System.out.println("Student Age ");
			student.setStudentAge(sc.nextInt());
			studentArray[i]=student;
			
		}
		
		
		
		//dispay Student Values
		System.out.println("Below is the Student details ");
		for(Student students:studentArray){
			System.out.println(students.getStudentId());
			System.out.println(students.getStudentFname());
			System.out.println(students.getStudentLname());
			System.out.println(students.getStudentAge());
		}
		

	}

}
