package lesson24;

public class AbstractDefaultStaticMethods2 {
//    Figure f = new Figure(); we can't create an object of abstract class
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
}

class Rectangle extends Figure{
}

class Circle extends Figure{
}




