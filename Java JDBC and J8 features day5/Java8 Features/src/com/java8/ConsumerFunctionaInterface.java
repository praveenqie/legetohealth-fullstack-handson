package com.org.functinolinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionaInterface {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> {
			System.out.println(t);
		};

		List<Integer> list = Arrays.asList(12, 2, 30, 32, 1);

		list.stream().forEach((l) -> System.out.println(l-20));

		consumer.accept(10000);
		List<Book> books = BookMain.getBookLists();
		books.stream().forEach((b) -> {
			System.out.println(b.getId() - 1);
		});

	}

}
