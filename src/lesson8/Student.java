package lesson8;

public class Student {
  String name;
  int course;
  static int count;
  int a;

  public Student(String name2, int course2) {
    count++;
    name = name2;
    course = course2;
    System.out.println("Student №" + count + " is created");
  }

  public static void showCount(){
    System.out.println("There are " + count + " students");
  }

  public void showInfo(){
    System.out.println("Welcome to the Student class!!!");
  }

  void abc(){
    a++;
    count++;
  }

  static void abcd(){
    Student st1 = new Student("Raisa", 18);
    st1.a++;
    count++;
  }

  public static void main(String[] args) {
    Student st2 = new Student("Ivan", 5);
    st2.abc();
    abcd();
  }

//  public static void main(String[] args) {
//    System.out.println(count);
//    showCount();
//  }

}
class StudentTest{
  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 1);
    Student st2 = new Student("Petr", 2);
    Student st3 = new Student("Alex", 3);

    System.out.println(st1.name);
    System.out.println(Student.count);
  }
}
