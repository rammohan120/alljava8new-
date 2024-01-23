import java.util.*;
import java.util.stream.Collectors;

public class EmpSalary {
    public static void main(String[] args) {
        List<Employee> emp =  Arrays.asList(
                new Employee(20,"ram","tt",2000),
                new Employee(22,"mm","kpm",2300),
                new Employee(21,"nn","kdr",2200)
        );

        List<Employee>ll=emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(e -> {
                    if(e.getSalary()>22000){

                     e.setSalary(e.getSalary()+1000);

                    };  // Increase salary by 10%
                    return e;
                }).collect(Collectors.toList());
        ll.forEach(System.out::println);
//
        List<Employee> modifiedEmployees = emp.stream()
                .map(e -> {
                    if (e.getSalary() > 22000) {
                        e.setSalary(e.getSalary() + 1000); // Modify salary
                        return e;
                    } else {
                        return null; // Exclude this employee from the result
                    }
                })
                .filter(e -> e != null) // Filter out null entries
                .collect(Collectors.toList());
        modifiedEmployees.forEach(System.out::println);


//        Map<String, List<Employee>> groupedByName = emp.stream()
//                .collect(Collectors.groupingBy(Employee::getName,
//                        Collectors.collectingAndThen(
//                                Collectors.toList(),
//                                list -> {
//                                    HashMap<String, List<Employee>> map = new HashMap<>();
//                                    list.forEach(person ->
//                                            // Perform computeIfAbsent operation on each element of the list
//                                            map.computeIfAbsent(person.getName(), k -> new LinkedList<>()).add(person)
//                                    );
//                                    return map;
//                                }
//                        )
//        Map<String, List<Employee>> groupedByName = emp.stream()
//                .collect(Collectors.groupingBy(Employee::getName,
//                        Collectors.collectingAndThen(
//                                Collectors.toList(),
//                                list -> {
//                                    Map<String, List<Employee>> map = new HashMap<>();
//                                    list.forEach(employee ->
//                                            // Perform computeIfAbsent operation on each element of the list
//                                            map.computeIfAbsent(employee.getName(), k -> new LinkedList<>()).add(employee)
//                                    );
//                                    return map;
//                                }
//                        )
//
//                ));
//        System.out.println(groupedByName);

    }
}
