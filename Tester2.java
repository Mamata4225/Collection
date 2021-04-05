package com.xworkz.collection;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tester2 {

	public static void main(String[] args) {
		
		String words="Bangalore is also called as it hub Bangalore recently awarded best"
				+ "city to live Bangalore is also called as green city Bangalore is capital city of karnataka";
    
	
    String[] split = words.split(" ");
	System.out.println("total words in string : "+split.length);
	
	words = Arrays.stream(words.split("\\s+")).distinct().collect(Collectors.joining(" "));
	System.out.println(words);
	}
}