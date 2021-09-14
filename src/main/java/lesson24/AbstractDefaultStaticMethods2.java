package lesson24;

public class AbstractDefaultStaticMethods2 {
    //    Figure f = new Figure(); we can't create an object of abstract class
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.numberOfSides);
        f1.square();
    }
}

abstract class Figure{

    int numberOfSides = 0;

    abstract void perimeter();
    abstract void square();
    void showInfo(){
        System.out.println("This is a figure");
    }
}


class Square extends Figure{
    int numberOfSides = 4;
    int sideFirst = 10;

    void perimeter(){
        System.out.println("Perimeter of square = " + 4 * sideFirst);
    }

    void square(){
        System.out.println("Square of square = " + sideFirst * sideFirst);
    }
}

class Rectangle extends Figure{
    int numberOfSides = 4;
    int sideFirst = 8;
    int sideSecond = 5;

    void perimeter(){
        System.out.println("Perimeter of rectangle = " + 2 * (sideFirst + sideSecond));
    }

    void square(){
        System.out.println("Square of rectangle = " + sideFirst * sideSecond);
    }
}


class Circle extends Figure{
    int numberOfSides = 0;
    int radius = 3;


    void perimeter(){
        System.out.println("Perimeter of circle = " + 2 * 3.14 * radius);
    }

    void square(){
        System.out.println("Square of circle = " + 3.14 * radius * radius);
    }
}

abstract class Polygon extends Figure{
    void def(){
        System.out.println("There is the polygon");
    }
}





