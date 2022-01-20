package com.org.functinolinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapStreamSort {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("praveen", 10000);
		map.put("naveen", 20000);
		map.put("ramesh", 5000);
		map.put("suresh", 30000);
		map.put("lathesh", 50000);
		
		List<Entry<String, Integer>> entries = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
//		Collections.sort(entries,new Comparator<Entry<String, Integer>>() {
//
//		
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getValue(), o2.getValue());
//			}
//			
//			
//		});
		map.entrySet().stream().sorted((o1,o2)-> o1.getValue()-o2.getValue()).forEach((a)->System.out.println(a.getKey()+"  "+a.getValue()));
	}

}
