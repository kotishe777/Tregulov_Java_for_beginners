package lesson27_28;

import java.util.ArrayList;

public class ExceptionsLearning8 {
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> list2;

    public static void main(String[] args) {
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));

        System.out.println(5/0);

        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee [] array1 = {d, t};
        Teacher t2 = (Teacher) array1[0];
        Teacher [] array2 = {t, t2};
//        Doctor d2 = (Doctor) array2[0];

        list2.add("!!!");

        Integer.parseInt("44cat");
    }

    public void createPassword(String password){
        if (password.length() < 6){
            throw new IllegalArgumentException("Password length is too short");
        }
        if (password.length() > 12){
            throw new IllegalArgumentException("Password length is too long");
        }
        System.out.println("Password accepted");
    }
}

class Employee{}

class Doctor extends Employee{}

class Teacher extends Employee{}

class Plane{
    String state = "waiting";

    public void flying(){
        state = "flying";
        System.out.println("Plane is flying");
    }

    public void waiting(){
        if (state.equals("flying")){
            throw new IllegalStateException("The plane is in the air");
        }
        state = "waiting";
        System.out.println("Plane is waiting");
    }

    public void canceled(){
        if (state.equals("flying")){
            throw new IllegalStateException("The plane is in the air");
        }
        state = "cancelled";
        System.out.println("Plane is cancelled");
    }

    public static void main(String[] args) {
        Plane p = new Plane();
        p.waiting();
    }
}
