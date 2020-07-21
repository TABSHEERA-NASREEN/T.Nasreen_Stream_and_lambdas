package com.klu.epam.Streams_and_lambdas;
/* Given a list of Strings, write a method that returns a list of all strings that
start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use
Java 8 Lambdas and Streams API's.
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
public class Stringswitha {

	public static List<String> filter(List<String> Str){
		List<String> resultString = Str.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length() == 3)
				.collect(Collectors.toList());
		return resultString;
	}

	public static void main(String args[]) {
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

	List<String> finalstring = new ArrayList<String>();
   	finalstring = filter(array); 
   	System.out.println("String that start with 'a' od size 3 is/are:");
   	for(String obj : finalstring)  
   		System.out.println(obj);  
   	sc.close();

}
}