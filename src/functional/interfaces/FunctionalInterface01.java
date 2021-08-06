package functional.interfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface01 {

	/*
	 * Consumer, Predicate,Function
	 * 
	 * boolean isEven(int x){ return x%2==0 }
	 * 
	 * alt + shift + l for creating local variable by selecting expression
	 * 
	 */
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 2, 4, 9, 8, 12, 7, 3);

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate2=new Predicate<Integer> () {

			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2==0;
			}
			
		};
		
		Function< Integer,Integer> squareFunction = x -> x * x;
		Function< Integer,Integer> squareFunction2=new Function< Integer,Integer> (){

			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
			
		};

		
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2=new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
				
			}
			
		};
	
		numbers.stream()
		.filter(isEvenPredicate2)
		.map(squareFunction2)
		.forEach(sysoutConsumer2);
		
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		BinaryOperator<Integer> sumBinaryOperator2=new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		}; 
		
		int sum= numbers.stream()
				.reduce(0, sumBinaryOperator2);
		System.out.println("The total sum of list ::"+sum);

	}

}
