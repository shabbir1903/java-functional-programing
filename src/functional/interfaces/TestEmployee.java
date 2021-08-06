package functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Shabbir", 101, "active", 50000));
		empList.add(new Employee(102, "Ali", 101, "active", 60000));
		empList.add(new Employee(103, "Raj", 102, "inactive", 80000));
		empList.add(new Employee(104, "Raju", 102, "inactive", 50000));
		empList.add(new Employee(105, "Bob", 103, "active", 20000));
		empList.add(new Employee(106, "Shivam", 103, "inactive", 20000));
		empList.add(new Employee(107, "alice", 101, "active", 50000));

		// 1.Write a program to print employee details working in each department
		System.out.println("======Write a program to print employee details working in each departmentt======");
		Map<Integer, List<Employee>> deptWiselist = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId, Collectors.toList()));

		deptWiselist.entrySet().forEach(entry -> {

			System.out.println(entry.getKey() + "-----" + entry.getValue());
		});

		// 2.Write a program to print employees count working in each department
		System.out.println("======Write a program to print employees count working in each department======");
		Map<Integer, Long> deptWisecount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId, Collectors.counting()));
		System.out.println(deptWisecount);
		deptWisecount.entrySet().forEach(entry -> {

			System.out.println("dept " + entry.getKey() + "-----" + entry.getValue());
		});

		// 3. Write a program to print active and inactive employees in the given
		// collection
		System.out
				.println("======Write a program to print active and inactive employees in the given collection======");

		// 4.Write a program to print Max/Min employee salary from the given collection
		System.out.println("======Write a program to print Max/Min employee salary from the given collection======");
		Optional<Employee> emp = empList.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Max Salary :::::" + emp);

		Optional<Employee> emp1 = empList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Min Salary :::::" + emp1);
//https://stackoverflow.com/questions/36040945/java-8-lambda-for-selecting-top-salary-employee-for-each-department
		// 5.Write a program to print the max salary of an employee from each department
		System.out.println("======.Write a program to print the max salary of an employee from each department======");

		Map<Integer, Optional<Employee>> maxSalaryByDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		maxSalaryByDeptWise.entrySet().forEach(entry -> {

			System.out.println("dept " + entry.getKey() + "-----" + entry.getValue());
		});
       
		
		System.out.println("======.Write a program to print no of times/word or number repeaated=====");
		List<Integer> listOfNo = Arrays.asList(1, 2, 1, 5, 8, 7, 5, 6, 2, 8, 8);
		Map<Integer, Long> count = listOfNo.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// or in place of function.identity we can use Integer::new

		count.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "------" + entry.getValue());

		});
		System.out.println("======.Write a program to print no of times/word are repeaated=====");
		List<String> str = Arrays.asList("Bob", "Bob", "Raj", "Raj", "Bob", "Ali", "Bob");
		Map<String, Long> strCount = str.stream().collect(Collectors.groupingBy(String::new, Collectors.counting()));
		strCount.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		});
		System.out.println("======.Write a program to print duplicate values in a String=====");
		String str1 = "I am am learning java java";
		String arr[] = str1.split(" ");
		List<String> strList = Arrays.asList(arr);

		Set<String> dup = strList.stream().collect(Collectors.groupingBy(String::new, Collectors.counting())).entrySet()
				.stream().filter(m -> m.getValue() > 1) // if map value > 1, duplicate element
				.map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println("Duplicate values:::;" + dup);

		System.out.println("======.Write a program to print duplicate values in a String using frequency=====");
		strList.stream().filter(items -> Collections.frequency(strList, items) > 1).forEach(System.out::println);
		System.out.println("=================second way to find duplicate element=====================");
		Set items = new HashSet<>();
		Set dupValue = strList.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already
																	// in the set.
				.collect(Collectors.toSet());
		System.out.println(dupValue);

		System.out.println("================Sorting a Map===================");
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("B4 Sorting:::::" + unsortMap);
		System.out.println("=======================Sorting By Keys==================");

		Map sorted = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		System.out.println("======Sorted Map====================");
		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the
		// order.
		// pass in the third mergeFunction argument
		System.out.println(sorted);

	}

	private static Object comparingInt(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
