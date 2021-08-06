package com.interview;

import java.util.function.Consumer;

public class ConsumerLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=(x)->System.out.println(x);
		c.accept("consumer ex");

	}

}
