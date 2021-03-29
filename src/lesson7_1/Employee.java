package lesson7_1;

public class Employee {

  public double salary;

  public void doubleSalary(){
    double newSalary = salary * 2;
    System.out.println("New salary:" + newSalary);
  }

  public Employee(double salary2){
    salary = salary2;
  }

  public static void main(String[] args) {
    Employee employee = new Employee(100.05);
    System.out.println(employee.salary);
    employee.doubleSalary();
  }
}

class EmployeeTest{

  public static void main(String[] args) {
    Employee employee = new Employee(100.05);
    System.out.println(employee.salary);
    employee.doubleSalary();
  }

}
