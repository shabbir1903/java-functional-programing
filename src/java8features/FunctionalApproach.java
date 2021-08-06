package java8features;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalApproach {

	private static void print(int n) {
		System.out.println(n);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumberIntList(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);// Method Reference
	}
	//Exercise 1- Print Odd Numbers from the list
	private static void printOddumberIntList(List<Integer> numbers) {
		numbers
		.stream()
		.filter(number->number %2!=0)
		.forEach(System.out::println);// Method Reference
	}
	
	//Excersise 2- Print courses individually
	private static void printCourseIndividually(List<String> courses) {
		String citiesCommaSeparated=courses
		.stream()
		.collect(Collectors.joining(","));
		System.out.println(citiesCommaSeparated);
	}

  // Exercise 3 - Print courses containg word "AWS"
	private static void printCourseContaingAWS(List<String> courses) {
		 courses
		.stream()
		.filter(course->course.equalsIgnoreCase("AWS"))
		.forEach(System.out::println);
	}
	
 // Exercise 4 - Print Courses whose name has at least 4 letters
	private static void printCourseContaing4Letters(List<String> courses) {
			 courses
			.stream()
			.filter(course->course.length()>=4)
			.forEach(System.out::println);
		}

	
	@SuppressWarnings("unused")
	private static void printAllEvenNumberIntList(List<Integer> numbers) {
		numbers.stream()
				// .filter(FunctionalApproach::isEven)// seperate method -Method Reference
				.filter(number -> number % 2 == 0)// using Lambda, single statement will return that
				.forEach(FunctionalApproach::print);// Method Reference
	}
	
	//Exercise 5 - Print Squares of Even numbers
	
	private static void printSquaresEvenNumberIntList(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 == 0)
				// mapping x->x * x
		.map(number -> number * number)
		.forEach(System.out::println);
	}
	
	//Execise 6 - Print sum of squares of the numbers
	
	private static void printSumOfSquaresIntList(List<Integer> numbers) {
		int value=numbers.stream()
		// mapping x->x * x
		.map(number -> number * number)
		.reduce(0,Integer::sum);
		System.out.print(value);
	}
	
    //Stream - It is sequence of  elements
	// What to do in Functional programming
	// Lambda is simplified expression of method, anonymous exception
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 2, 4, 9, 8, 12, 7, 3);
		List<String> course = List.of("Java", "Spring", "PHP", "Microsoft","AWS");
		
		// printAllNumberIntList(numbers);
		//printAllEvenNumberIntList(numbers);
		//printOddumberIntList(numbers);
		
		/*printCourseIndividually(course);
		printCourseContaingAWS(course);
		printCourseContaing4Letters(course);*/
		
		//printSquaresEvenNumberIntList(numbers);
		printSumOfSquaresIntList(numbers);

	}

}
