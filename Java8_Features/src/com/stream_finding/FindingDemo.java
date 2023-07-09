package com.stream_finding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.stream_examp.Person;

public class FindingDemo {

	// findfirst
	// findany

	public static void main(String[] args) {

		Person p1 = new Person("Raju", "Software", 32353245);
		Person p2 = new Person("Gopi", "Software", 32353245);
		Person p3 = new Person("Mahesh", "Software", 32353245);
		Person p4 = new Person("Sunil", "Photoshop", 32353245);

		List<Person> asList = Arrays.asList(p1, p2, p3, p4);
		// Optional<Person> findFirst = asList.stream().filter(e ->
		// e.getJob().equals("Software")).findFirst();

		Optional<Person> findFirst = asList.stream().filter(e -> e.getJob().equals("Software")).findAny();

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}
}
