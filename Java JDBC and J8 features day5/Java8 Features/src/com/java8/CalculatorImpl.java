package com.org.functinolinterface;

@FunctionalInterface
interface Calculator {
	
	
//	public void switchOn();

	public int substract(int a, int b);
	
	default void swicthOff() {
		System.out.println("Calculator is turned off ....");
	}

	public static void sum(int a, int b) {

		System.out.println("sum of a and b is :" + (a + b));
	}
}

public class CalculatorImpl {

	public static void main(String[] args) {
//		Calculator calculator = () -> {
//			System.out.println("Calculator is turned on...");
//		};
		Calculator calculator = (a,b)-> a-b;
		System.out.println(calculator.substract(20, 5));
		Calculator.sum(10, 20);
	}
}
