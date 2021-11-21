package lesson30.homework30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Homework30 {
}

class Employee{
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {

    void printEmployee(Employee e){
        System.out.println("Employee name: " + e.name + ", department: " + e.department + ", salary: " + e.salary + ".");
    }

    void filterEmployee(ArrayList<Employee> list, Predicate<Employee> t){
        for (Employee e : list){
            if (t.test(e)){
               printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee e1 = new Employee("John", "IT", 500);
        Employee e2 = new Employee("Mike", "HR", 600);
        Employee e3 = new Employee("Elena", "IT", 550);
        Employee e4 = new Employee("Petr", "IT", 650);
        Employee e5 = new Employee("Maria", "HR", 700);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        TestEmployee ti = new TestEmployee();
        ti.filterEmployee(list, e -> e.department.equals("IT") && e.salary > 200);
        System.out.println("_________________________________________________________________________________________");
        ti.filterEmployee(list, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("_________________________________________________________________________________________");
        ti.filterEmployee(list, e -> e.name.equals(e.department));
    }
}