package org.ConstClass;

public class Tasktwo {
	
	public Tasktwo() {
		System.out.println("default");
	}
	public Tasktwo(int age) {
		this(true);
		System.out.println("your age is ="+age);
	}
		
		public Tasktwo(boolean bo ) {
        this("Appu");
        System.out.println("Summer is so hot="+bo);
			
	
	}
		public Tasktwo(String name) {
			this();
		
			System.out.println("Your name is ="+name);
		}
		
	

}

