package java8features;

import java.util.List;

public class TraditionalApproach {

	private static void printAllNumberIntList(List<Integer> numbers) {
     for(int number:numbers){
    	System.out.println(number); 
     }
	}

	public static void main(String[] args) {

		printAllNumberIntList(List.of(12, 2, 4, 9, 8, 12, 7, 3));
	}
}
