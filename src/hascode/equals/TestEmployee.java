package hascode.equals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Shabbir", 30);
		Employee emp2 = new Employee("Vijay", 31);
		Employee emp3 = new Employee("Shabbir", 35);
		Employee emp4 = new Employee("Kamran", 36);
		Employee emp5 = new Employee("Md", 32);
		Employee emp6 = new Employee("Azad", 42);
		List<Employee> empList = new ArrayList<Employee>();
        Comparator<Employee> c =(o1,o2)->-o1.getName().compareTo(o2.getName());
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.stream()
		.sorted(Comparator.comparing(Employee::getAge).reversed()).distinct()
		.forEach(System.out::println);

	}

}
