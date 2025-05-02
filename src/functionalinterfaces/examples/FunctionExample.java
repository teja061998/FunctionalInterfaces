package functionalinterfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Alice", 30, 70000), new Employee("Bob", 25, 50000));

		// Function: Convert Employee to a formatted string
		Function<Employee, String> format = e -> "Name: " + e.name + ", Age: " + e.age + ", Salary: $" + e.salary;

		System.out.println("Employee Summary:");
		employees.stream().map(format).forEach(System.out::println);
	}

}
