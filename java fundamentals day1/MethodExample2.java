package javafundamental;

public class MethodExample2 {
	public static void main(String[] args) {
		int largeNumber = findLargest(0, 20, 21);
		System.out.println("The Largest Number is" + largeNumber);
	}

	public static int findLargest(int a, int b, int c) {

		if (a <= 0 && b <= 0 && c <= 0) {
			return 0;
		}
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

}
