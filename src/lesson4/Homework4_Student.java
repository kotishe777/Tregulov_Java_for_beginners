package lesson4;

class Student {
  int student_ID;
  String first_name;
  String last_name;
  int year_of_study;
  float average_score_of_math;
  float average_score_of_economics;
  float average_score_of_foreign_language;

}

class StudentTest {

  static float averageScore(Student student) {
    float AS = (student.average_score_of_math + student.average_score_of_economics + student.average_score_of_foreign_language) / 3;
    return AS;
  }

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    student1.student_ID = 1;
    student1.first_name = "Ivan";
    student1.last_name = "Ivanov";
    student1.year_of_study = 1;
    student1.average_score_of_math = 4;
    student1.average_score_of_economics = 5;
    student1.average_score_of_foreign_language = 6;

    student2.student_ID = 2;
    student2.first_name = "Vladimir";
    student2.last_name = "Sidorov";
    student2.year_of_study = 2;
    student2.average_score_of_math = 7;
    student2.average_score_of_economics = 8;
    student2.average_score_of_foreign_language = 9;

    student3.student_ID = 3;
    student3.first_name = "Alex";
    student3.last_name = "Petrenko";
    student3.year_of_study = 3;
    student3.average_score_of_math = 10;
    student3.average_score_of_economics = 11;
    student3.average_score_of_foreign_language = 12;


    System.out.println("Ivanov: " + averageScore(student1));
    System.out.println("Sidorov: " + averageScore(student2));
    System.out.println("Petrenko: " + averageScore(student3));
  }
}

