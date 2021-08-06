package com.interview;

import java.util.function.*;

public class TestSubtract {


	/*@Override
	public void difference(int a, int b) {
		int c=a-b;
		System.out.println("The difference of two nos is ::::"+c);
		
	}*/
	public static void main(String[] args) {
		
	
	/*TestSubtract t= new TestSubtract();
	t.difference(10, 5);*/
	 BiFunction <Integer,Integer,Integer> biFunc = (a, b)->{
		 int c=a-b;
		 System.out.println("The disfference of two nos is ::::"+c);
		 return c;
	 };
	 
	/*SubtractInterface s= (a, b)->System.out.println("The disfference of two nos is ::::"+(a-b));
	s.difference(10, 20);*/
	 
	 biFunc.apply(10, 5);
	
	}
}
