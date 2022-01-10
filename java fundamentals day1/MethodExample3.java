package javafundamental;

public class MethodExample3 {

	public static void main(String[] args) {
		int sum = sumOfBigAndSmallNumber(20, 2, 40);
		System.out.println(sum);
	}

	private static int sumOfBigAndSmallNumber(int i, int j, int k) {
		int biggest = 0, smallest = 0;
		if (i > j && i > k) {
			biggest = i;
		} else if (j > k) {
			biggest = j;
		} else {
			biggest = k;
		}
		if (i < j && i < k) {
			smallest = i;
		} else if (j < k) {
			smallest = j;
		} else {
			smallest = k;
		}
		return biggest + smallest;
	}

}
