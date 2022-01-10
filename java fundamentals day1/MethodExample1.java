package javafundamental;

import java.util.Scanner;

public class MethodExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the person name to welcome");
		String name = sc.nextLine();
		System.out.println(invite(name));
	}

	public static String invite(String name) {
		return "Hello " + name + ", welcome to java";
	}

}
