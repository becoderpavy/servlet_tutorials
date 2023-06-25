package com.methodrefernce;

public class Sample {

	public static void main(String[] args) {
		mySampleInterface msi = Sample::new;
		System.out.println(msi.getSamp());
	}
}

interface mySampleInterface {
	Sample getSamp();
}