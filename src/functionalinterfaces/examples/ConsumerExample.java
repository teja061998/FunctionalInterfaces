package functionalinterfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 30, 70000), new Employee("Bob", 25, 50000));

		// Consumer: Print employee details in uppercase
		Consumer<Employee> printUpper = e -> System.out.println(e.name.toUpperCase() + " earns $" + e.salary);

		System.out.println("Formatted Employee Details:");
		employees.forEach(printUpper);
	}

}
