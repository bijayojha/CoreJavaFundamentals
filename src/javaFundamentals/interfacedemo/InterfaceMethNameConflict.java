package javaFundamentals.interfacedemo;

public class InterfaceMethNameConflict implements Left,Right{
	public static void main(String[] args) {
		InterfaceMethNameConflict on= new InterfaceMethNameConflict();
		on.m1();
	}

	public void m1(){
		System.out.println("I am in which method");
	}
}
