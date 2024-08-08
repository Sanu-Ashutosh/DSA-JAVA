import java.util.ArrayList;
import java.util.*;

public class JAVA8 implements I1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        l1.add(10);
        l1.add(10);
        l1.add(20);
        l1.add(20);
        l1.add(30);
        l1.add(30);
        l1.add(40);

        l1.forEach((data) -> System.out.println(data));

        Set<String> s1 = new HashSet<String>();
        s1.add("10 string");
        s1.add("20 string");
        s1.add("20 string");
        s1.add("30 string");
        s1.add("40 string");
        s1.add("40 string");

        s1.forEach((data) -> System.out.println(data));

        Set<Object> obj = new HashSet<Object>(l1);
        System.out.println("Alllsv");
        obj.forEach((data) -> System.out.println(data));

        Set<Employee> employee = new HashSet<Employee>();

        employee.add(new Employee(101, "Ashutosh", 100000l));
        employee.add(new Employee(102, "dsvsd", 100000l));
        employee.add(new Employee(103, "sdfds", 100000l));
        employee.add(new Employee(103, "fsfs", 100000l));
        employee.add(new Employee(104, "tgvfdsc", 100000l));

        employee.forEach((emp) -> { 
            // System.out.println(emp);
            emp.setEmpName("Ashutosh KKKK");
            System.out.println("After modification");
            System.out.println(emp);
            employee.remove(emp);

        });

    }
}
