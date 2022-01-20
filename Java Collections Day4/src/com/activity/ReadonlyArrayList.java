package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadonlyArrayList {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<String>();

		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");

		List<String> unmodifiableList = Collections.unmodifiableList(fruitList);
		unmodifiableList.add("INDIA");
		System.out.println(fruitList);
	}
}
