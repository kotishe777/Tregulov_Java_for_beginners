package lesson25;

public class PolymorphismLearning {
    public static void main(String[] args) {
        Employee employee1 = new Teacher();
        Employee employee2 = new Driver();
        Employee employee3 = new Doctor();
        HelpAble employee4 = new Teacher();
        String s = null;

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.help();

        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Teacher(), new Doctor()};
        HelpAble [] array3 = {new Driver(), new Teacher(), new Doctor()};
        Employee [] array4 = {employee1, employee2, employee3};

        for (Employee employee : array4){
            employee.work();
        }

        System.out.println(employee1 instanceof HelpAble);
        System.out.println(employee1 instanceof Employee);
        System.out.println(employee1 instanceof Teacher);
        System.out.println(employee1 instanceof Driver);
        System.out.println(s instanceof String);
    }
}

interface HelpAble{
    void help();
}

abstract class Employee {
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements HelpAble{
    public void help(){
        System.out.println("Teacher helps");
    }
    void work(){
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements HelpAble{
    public void help(){
        System.out.println("Driver helps");
    }
    void work(){
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements HelpAble{
    public void help(){
        System.out.println("Doctor helps");
    }
    void work(){
        System.out.println("Doctor works");
    }
}
