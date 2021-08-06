package com.interview;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = ()-> {
			String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};
        r.run();
		Thread t= new Thread(r);
		t.start();

		}
		
	}
