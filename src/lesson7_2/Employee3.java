package lesson7_2;

import lesson7_1.homework7.Employee;

public class Employee3 {

  public static void main(String[] args) {

    Employee employee = new Employee("Ivanov");
    //Employee employee2 = new Employee(2,"Petrov");
    //Employee employee3 = new Employee(3,"Sidorov",300);


    //System.out.println(employee.salary);
    System.out.println(employee.surname);
    //System.out.println(employee.id);
    employee.showSalary(100);
    employee.showSurname("Ivanov");
    employee.showId(1);

  }
}
