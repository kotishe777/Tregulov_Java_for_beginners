package lesson22.homework22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println(getName() + ", " + getCourse() + ", " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName(new StringBuilder("Ann"));
        student1.setCourse(4);
        student1.setGrade(10);
        student1.showInfo();

//        Student student2 = new Student();
//        student2.setName(new StringBuilder("A"));
//        student2.setCourse(5);
//        student2.setGrade(0);
//        student2.showInfo();
    }
}
