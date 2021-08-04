package lesson7_1;

public class Class2 {

  public static void main(String[] args) {
    Employee employee = new Employee(100.05);
    System.out.println(employee.salary);
    employee.doubleSalary();
  }

}
