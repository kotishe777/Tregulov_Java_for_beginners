package lesson6;

public class Student {
  int id;
  String name;
  String surname;
  String course;
  int year_of_study;
  int average_score_of_math;
  int average_score_of_economics;
  int average_score_of_foreign_language;

  Student(int id3, String name3, String surname3, String course3, int year_of_study3,
          int average_score_of_math3, int average_score_of_economics3, int average_score_of_foreign_language3) {
    this(id3, name3, surname3, course3);
    year_of_study = year_of_study3;
    average_score_of_math = average_score_of_math3;
    average_score_of_economics = average_score_of_economics3;
    average_score_of_foreign_language = average_score_of_foreign_language3;
  }

  Student(int id2, String name2, String surname2, String course2) {
    id = id2;
    name = name2;
    surname = surname2;
    course = course2;
  }

  Student() {
  }

  static class StudentTest {

    public static void main(String[] args) {

      Student student1 = new Student(1, "Vasya", "Pupkin", "actor", 1,
              2, 3, 4);
      System.out.println(student1.surname);

      Student student2 = new Student(2, "Galya", "Svinko", "designer");
      System.out.println(student2.surname);

      Student student3 = new Student();
      System.out.println(student3.surname);
    }
  }

}
