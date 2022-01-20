package com.org.functinolinterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if (t < 18)
				return true;
			else
				return false;
		};

		System.out.println(predicate.test(20));

		List<Book> books = BookMain.getBookLists();

		List<Book> ss= books.stream().filter((b) -> b.getPages() > 50).collect(Collectors.toList());
		
		ss.stream().forEach(s->System.out.println("id"+s.getId()+" "+s.getName()+" "+s.getPages()));
	}

}