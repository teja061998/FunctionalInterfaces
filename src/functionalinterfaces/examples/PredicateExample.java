package functionalinterfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//FunctionalInterface of predicate signature
//public interface Predicate<T> {
//    boolean test(T t);
//}

public class PredicateExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 30, 70000), new Employee("Bob", 25, 50000),
				new Employee("Charlie", 35, 85000));

		// Predicate: Filter employees with salary > 60000
		Predicate<Employee> highSalary = e -> e.salary > 60000;

		System.out.println("Employees with high salary:");
		employees.stream().filter(highSalary).forEach(System.out::println);
	}
}
