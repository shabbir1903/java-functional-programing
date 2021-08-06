package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntegerList {
// comparable and comparaotor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(40);
		al.add(25);
		al.add(10);
		al.add(50);
		al.add(0);
		
		Comparator<Integer> c=(o1, o2)-> o2<o1?-1:o2>o1?1:0;
		Collections.sort(al,c);
		System.out.println(al);
		

	}

}
