package javafundamental;

public class NumberIntoWords {

	public static void main(String[] args) {
		getNumberInWords(754);
	}

	private static void getNumberInWords(int i) {
		String word = "";
		while (i != 0) {
			int number = i % 10;
			i /= 10;
			switch (number) {
			case 1:
				word = "one "+word;
				break;
			case 2:
				word = "two "+word;
				break;
			case 3:
				word = "three "+word;
				break;
			case 4:
				word = "four "+word;
				break;
			case 5:
				word = "five "+word;
				break;
			case 6:
				word = "six "+word;
				break;
			case 7:
				word = "seven "+word;
				break;
			case 8:
				word = "eight "+word;
				break;
			case 9:
				word = "nine "+word;
				break;
			case 0:
				word = "zero "+word;
				break;
			default:
				break;
			}
		}
		System.out.println(word);

	}

}
