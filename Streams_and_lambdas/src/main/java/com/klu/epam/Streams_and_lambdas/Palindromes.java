package com.klu.epam.Streams_and_lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/* Given a list of Strings (that contains both palindromes and nonpalindromes), write a method that returns a list of all the palindrome
strings. */
public class Palindromes {
	public static<T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> resultlist = new ArrayList<>();
		for (T i : list) {
			if(func.apply(i) != "1")
				resultlist.add(func.apply(i));
		}
		return resultlist;
}
	
	public static String isPalindrome(String original) {
	    String reverse = "";
	    StringBuffer org=new StringBuffer(original);
	    reverse=org.reverse().toString();
	    
	  
	    	if (original.equals(reverse))  
	        	return original;
	      	else 
	      		return "1";
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		List<String> array = new ArrayList<String>(size);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter string:");
			String n = sc.next();
			array.add(n);
        }
		List<String> result = Palindromes.map(array,Palindromes::isPalindrome);
	    System.out.println("The palindrome strings is/are:");
		for(String obj : result)  
	   		System.out.println(obj);  
	    sc.close();  
	}

}
