package lesson7_1.homework7;

public class Employee {

  private double salary;
  public String surname;
  int id;

  public void showSalary(double salary2){
    salary = salary2;
    System.out.println("Employee salary: " + salary);
  }

  public void showSurname(String surname2){
    surname = surname2;
    System.out.println("Employee surname: " + salary);
  }

  public void showId(int id2){
    id = id2;
    System.out.println("Employee id: " + id);
  }

  public Employee(String surname2){
    surname = surname2;
  }

  Employee(int id2, String surname2){
    id = id2;
    surname = surname2;
  }

  private Employee(int id2, String surname2, double salary2){
    id = id2;
    surname = surname2;
    salary = salary2;
  }

  public static void main(String[] args) {

    Employee employee = new Employee("Ivanov");
    Employee employee2 = new Employee(2,"Petrov");
    Employee employee3 = new Employee(3,"Sidorov",300);


    System.out.println(employee.salary);
    System.out.println(employee.surname);
    System.out.println(employee.id);
    employee.showSalary(100);
    employee.showSurname("Ivanov");
    employee.showId(1);

  }
}
