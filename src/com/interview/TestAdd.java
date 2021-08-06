package com.interview;

import java.util.function.BiFunction;

public class TestAdd {

	public static void main(String[] args) {
	 BiFunction<Integer, Integer, Integer> bi=(a,b)->{
		 int c=a+b;
		 System.out.println("The sum of the no in BiFunction:::"+(a+b));
		 return c;
	 };
		// TODO Auto-generated method stub
      AddInterface addinter= (a,b)-> System.out.println("The sum of the no is:::"+(a+b));
      addinter.add(10, 20);
      bi.apply(40, 20);
	}

}
