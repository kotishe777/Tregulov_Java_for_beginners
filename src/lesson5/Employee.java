package lesson5;

public class Employee {

  Employee(int ID, String surname, int age, double salary, String department){
    employeeSalary = salary;
  }

  double employeeSalary;

  double doubleSalary(){
    double DS = employeeSalary * 2;
    return DS;
  }


  static class EmployeeTest{

    public static void main(String[] args) {
      Employee employee1 = new Employee(1, "John", 25, 100, "D1");
      Employee employee2 = new Employee(1, "Jack", 23, 200, "D2");

      System.out.println(employee1.doubleSalary());
      System.out.println(employee2.doubleSalary());

    }
  }
}
