package com.interfaceexamples;

public class MyInterface implements InterfaceExample2 {

	@Override
	public void display() {
		System.out.println("This is a display method");
	}

	public static void main(String args[]) {
		InterfaceExample2 obj = new MyInterface();
		obj.display();
	}
}
