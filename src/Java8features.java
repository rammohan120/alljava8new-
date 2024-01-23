import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Java8features {
    public static void main(String[] args) {


        List<Employee> emp = new ArrayList<>(Arrays.asList(
                new Employee(20, "ram", "kpm", 20000),
                new Employee(23, "mohan", "tpt", 2100),
                new Employee(24, "kumar", "bkp", 23000),
                new Employee(28, "ram2", "atp", 25000)));



        Stream<String> nameStream = emp.stream().map(Employee::getName);



    }
}
