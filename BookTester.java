package com.xworkz.collection;

public class BookTester {

	public static void main(String[] args) {
		BookDTO java = new BookDTO(120, 50, "xworkzjava", "omkar",1);
		
		BookDTO html = new BookDTO(100, 500, "HTML", "mamata",2);
		
		int value = java.compareTo(html);
		System.out.println("returned value  : " +value);
	}
}
