import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeSalaryAnalysis {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(    new Employee(1, "Alice", "HR", 5000.0),    new Employee(2, "Bob", "IT", 7000.0),    new Employee(3, "Charlie", "Finance", 6000.0),    new Employee(4, "David", "HR", 4000.0),    new Employee(5, "Eve", "IT", 8000.0),    new Employee(6, "Frank", "Finance", 5500.0));

      //  employees.stream().collect(Collectors.groupingBy());
    }

}
