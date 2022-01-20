package com.org.functinolinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;



public class SuplierFunctionalInterface {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "ss" ;
		List<String> names = Arrays.asList("praveen","naveen","kumar","lochan","nuthan");
		
		
		System.out.println(names.stream().findAny().orElseGet(()-> "praveen"));
	}
}
