package org.ConstClass;

public class Taskone extends Tasktwo {
	
	public Taskone() {
		this(75.8f);
		System.out.println("default constructor");
		
		
	}
	public Taskone(float height) {
		this('A');
		System.out.println("float height="+height);
		
		
	}
	public Taskone(char name) {
		this(55655966l);
		System.out.println("Character name="+name);
		
		
	}
	public Taskone(long ph) {
		super(55);
		System.out.println("your phone no is="+ph);
	}
	
	public static void main(String[] args) {
		Taskone t = new Taskone();
		
       
		
		
		
	}
	
	

}
