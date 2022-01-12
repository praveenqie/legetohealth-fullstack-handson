package com.stringexample;

public class TestSrings {
	
	public static void main(String[] args) {
		
	
	String s1 = "hello";
	String s2 = "hello";
	
	String s3 = new String("hello");
	
	String s4 = new String("hello");
	System.out.println("s1 == s2: "+(s1 == s2));
	
	System.out.println("s1 equals s2: "+s1.equals(s2));
	System.out.println("s1 == s2: "+(s3 == s4));
	System.out.println("s1 == s2: "+(s1 == s3));
	System.out.println("s1 equals s3: "+s1.equals(s3));	
    System.out.println(s1);
    s1.concat("123");
    StringBuffer sb = new StringBuffer("testsb");
    StringBuffer sb2 = new StringBuffer("testsb");
    System.out.println("sb equals sb2:"+sb.equals(sb2));
    System.out.println(sb+" "+sb2);
    sb.append("test add append");
    System.out.println(sb+" "+sb2);
    
	}

}
