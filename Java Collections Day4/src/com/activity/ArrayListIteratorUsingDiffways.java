package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteratorUsingDiffways {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// Using ListIterator
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// Using forEach() method
		list.forEach(a -> {
			System.out.println(a);
		});
//https://www.javatpoint.com/java-arraylist
		// Using forEachRemaining() method
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> {
			System.out.println(a);
		});

	}
}
