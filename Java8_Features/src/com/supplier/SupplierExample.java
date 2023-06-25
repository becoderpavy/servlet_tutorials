package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
	// lambda not taking any argument but it returns result
	public static void main(String[] args) {
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get());
	}
}
