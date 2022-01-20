package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("pineapple");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		for(String fruit:list)
//			System.out.println(fruit);
	}

}
