package lesson6;

public class Employee {

  Employee(int id2, String surname2, int age2) {
    this(surname2, age2);
    id = id2;
  }

  public Employee(String surname3, int age3) {
    surname = surname3;
    age = age3;
  }

  Employee(int id4, String surname4, int age4, double salary4, String department4) {
    this(id4, surname4, age4);
    salary = salary4;
    department = department4;
  }

  int id;
  String surname;
  int age;
  double salary;
  String department;


  static class EmployeeTest {

    public static void main(String[] args) {
      Employee employee1 = new Employee(1, "Ivanov", 25);
      System.out.println(employee1.surname);
      Employee employee2 = new Employee("Petrov", 30);
      System.out.println(employee2.surname);
      Employee employee3 = new Employee(3,"Petrenko", 34, 1000.00, "D3");
      System.out.println(employee3.surname);

    }
  }
}
