package lists.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // ArrayList is good for random access and if you know the index. Good for iterating over the list but not for inserting/deletion/removing and accessing if you do not know the index.

//        List<Employee> employeeList = new ArrayList<>();

        // You could change the ArrayList to a Vector (synchronized). Using a vector will be better for multi-thread operations where many people could be writing to the same List. If you use Vector, it has additional overhead.
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Hung", "Ly", 123));
        employeeList.add(new Employee("Mike", "Jordan", 2323));
        employeeList.add(new Employee("David", "Blaine", 100));
        employeeList.add(new Employee("Larry", "Bird", 33));

        // printing employees
//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1)); // O(1)
//        System.out.println(employeeList.isEmpty());

        // replacing employee
        employeeList.set(2, new Employee("Magic", "Johnson", 32)); // O(1)
//        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.add(3, new Employee("Steve", "Young", 11));
//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        // will print false because this
        System.out.println(employeeList.contains(new Employee("Steve", "Young", 11)));

        System.out.println(employeeList.indexOf(new Employee("Magic", "Johnson", 32)));

        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
