package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		Collections.sort(list1);

		for (String fruit : list1)
			System.out.println(fruit);

		System.out.println("Sorting numbers...");
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		Collections.sort(list2);
		for (Integer number : list2)
			System.out.println(number);
		
		Collections.sort(list2, Collections.reverseOrder());   
		
		for (Integer number : list2)
			System.out.println(number);
		
	}

}
