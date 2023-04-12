package com.gqt.stringproj.pkg1;

public class StringCode6 {

	public static void main(String[] args) {
		String s1 = "MaHaBharatHA";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('B'));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.startsWith("MaHa"));
		System.out.println(s1.startsWith("vaha"));
		System.out.println(s1.endsWith("ratHa"));
		System.out.println(s1.endsWith("vaha"));
		System.out.println(s1.contains("Bharat"));
		System.out.println(s1.contains("vharat"));
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('a'));
		
    }

}
