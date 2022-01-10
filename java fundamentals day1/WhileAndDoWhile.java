package javafundamental;

public class WhileAndDoWhile {
	public static void main(String[] args) {
		int i = 3, n = 8;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

		int count = 1;
		do {
			System.out.println("Count is: " + count);
			count++;
		} while (count < 6);
	}

}
