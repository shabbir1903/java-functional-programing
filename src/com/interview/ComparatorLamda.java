package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLamda {
	
	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(25);
		al.add(5);
		al.add(0);
		al.add(50);
		//Collections.sort(al,new MyComparator());
		 Comparator<Integer> c=(o1,o2)->{
			 /*if (o1<o2){
					return -1;
				}
				else if(o1>o2) {
					return +1;
				}
				return 0;*/
				return o1<o2?-1:o1>o2?1:0;
		 };
	    Collections.sort(al,c);
		System.out.println(al);
		
	}

}
