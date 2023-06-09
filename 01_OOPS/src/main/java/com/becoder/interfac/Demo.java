package com.becoder.interfac;

interface action{
	public void eat(String m);
}


class animal implements action{
	public void eat(String m) {
		System.out.println("animal eat=" + m);
	}
}

class bird implements action {
	
	public void eat(String m) {
		System.out.println("Bird eat=" + m);
	}
}



public class Demo {
	public static void main(String[] args) {
		
		action ob=new bird();
		ob.eat("Vegetable");
		
		ob=new animal();
		ob.eat("chicken");
		
		
		
		
		
	}
}