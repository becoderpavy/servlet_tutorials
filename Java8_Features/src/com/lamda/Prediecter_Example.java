package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class user {
	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public user(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}

}

public class Prediecter_Example {

	public static void main(String[] args) {
//		Predicate<String> p = (name) -> name.length() > 7;
//		System.out.println(p.test("Pabitra"));

		// Q2- print name start with A
		
		/*
		 * String[] names = { "Kajal", "Anuskha", "Anupama", "Surya" };
		 * 
		 * Predicate<String> p = (name) -> name.startsWith("A");
		 * 
		 * for (String name : names) { if (p.test(name)) { System.out.println(name); } }
		 */

		// Q3- print person name who are eligilble for vote

		List<user> asList = Arrays.asList(new user("Becoder", 14), new user("Dipu", 19));

		Predicate<user> p = (u) -> u.getAge() > 18;

		for (user u : asList) {
			if (p.test(u)) {
				System.out.println(u);
			}
		}
		p.

	}

}
