package com.interview;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.tools.javac.util.List;

public class PredicateExample {

	public static void main(String[] args) {
    List<Integer> al=List.of(25,50,20,70,90,45);
	Predicate<Integer> p=(n)->{
		return n%2==0;
	};
	System.out.println(p.test(20));
	al.stream().filter(n->n%2==0).forEach(System.out::println);
	
	Predicate<String> lengthIs3 = x -> x.length() == 3;// true or fale
	
	
    Predicate<String> startWithA = x -> x.startsWith("A");

    java.util.List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
  
    
    
    
    java.util.List<String> collect = list.stream()
            .filter(lengthIs3.or(startWithA))
            .collect(Collectors.toList());

    System.out.println(collect);

	}

}
