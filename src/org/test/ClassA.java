package org.test;

public class ClassA extends ClassB {
	public ClassA() {
		super("javith");
		System.out.println("default constructor");
	}
	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		
	}

}
