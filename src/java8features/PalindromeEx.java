package java8features;

import java.util.Arrays;
import java.util.List;

public class PalindromeEx {

	public static void main(String[] args) {
		
		String input = "madam";
		StringBuffer sb = new StringBuffer(input);
		String data = sb.reverse().toString();
		if (data.equals(input)) {
			System.out.println("Palindrome of a no");
		} else {
			System.out.println("not a palindrome");
		}

		System.out.println("Another way");
		char[] s = input.toCharArray();
		String reverse = "";
		for (int i = s.length - 1; i > 0; i--) {
			reverse = reverse + s[i];
		}
		if (reverse.equals(input)) {
			System.out.println("Palindrome of a number using Another way");
		} else {
			System.out.println("Not a palindrome");
		}
		
		System.out.println("Duplicate Array element");
		int a[]= {2,3,6,2,8,2,8};
		List list=Arrays.asList(a);
		list.stream().distinct().forEach(System.out::println);
		
	}

}
