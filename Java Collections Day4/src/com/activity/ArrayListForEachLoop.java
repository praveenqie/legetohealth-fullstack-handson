package arrayList;

import java.util.ArrayList;

public class ArrayListForEachLoop {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("t1");
		list.add("t2");
		list.add("t3");
		list.add("t4");
		list.add("t5");
		for(String t: list)
			System.out.println(t);
 	}

}
