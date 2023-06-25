package com.methodrefernce;

public class Test {

	public static void m2() {
		System.out.println("Calling m2 method");
	}

	public static void main(String[] args) {
		myInterface mi = Test::m2;
		mi.m1();
	}

}

interface myInterface {
	public void m1();
}
