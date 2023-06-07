package com.cokl;

import com.ds.Soniya;

public class Kadan extends Soniya {
	 Kadan() {
		this("Dhanasekar",5556);
		System.out.println("default Constructor``````");
		
	}
	
	Kadan(int age,String name){
		this();
		System.out.println("AGE:"+age+"\tCEO:"+name);
		
	}
     public  Kadan (String name,int age){
    	 super('S');
    	   
    
	System.out.println("Manager:"+name+"\nAGE:"+age);
	
}
public static void main(String[] args) {
	Kadan k=new Kadan(5555,"Soniya");
}
}
