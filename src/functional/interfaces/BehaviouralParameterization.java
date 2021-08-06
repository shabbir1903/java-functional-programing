package functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class BehaviouralParameterization {

	
	private static void printSquaresEvenNumberIntList(List<Integer> numbers) {
		
		
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 2, 4, 9, 8, 12, 7, 3);
		
		Function<Integer, Integer> mappingFunction = number -> number * number;
		List<Integer> squaredNumbers=mapAndCreateNewList(numbers, number -> number * number);
		List<Integer> cubeNumbers=mapAndCreateNewList
				(numbers, number -> number * number *number);
		//Passing behaviour to the method
        System.out.println("squaredNumbers::"+squaredNumbers);
    //1 
    Supplier<Integer> randomIntegerSupplier= () -> 2;
    System.out.println("randomIntegerSupplier"+randomIntegerSupplier.get());
    
    //2.
    UnaryOperator<Integer> unaryOperator =(x)->3*x;
    System.out.println("UnaryOperator "+unaryOperator.apply(10));
    
    //3
    BiPredicate<Integer,String> biPredicate = (number,str)-> {
    	return number<10 && str.length()>5;
    };
    System.out.println("biPredicate "+biPredicate.test(10,"Shabbir"));
    
    //4
    BiFunction<Integer,String,String> biFunction = (number,str)-> {
    	return number+str;
    };
    System.out.println("biFunction "+biFunction.apply(10,"Shabbir"));
    
    //5
    BiConsumer<String,String> biConsumer = (s1,s2)-> {
    	 System.out.println(s1);
    	 System.out.println(s2);
    };
    biConsumer.accept("Shabbir","ali");
    
	}
	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream()
					   .map(mappingFunction)
					   .collect(Collectors.toList());
	}

}
