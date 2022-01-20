package arrayList;

import java.util.ArrayList;

public class GetAndSetArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		for (String fruit : al)
			System.out.println(fruit);
		System.out.println("after setting  element: ");
		al.set(1, "Dates");
		for (String fruit : al)
			System.out.println(fruit);
	}
}
