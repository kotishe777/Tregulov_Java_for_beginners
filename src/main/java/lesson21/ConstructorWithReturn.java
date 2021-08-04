package lesson21;

public class ConstructorWithReturn {
    ConstructorWithReturn(){
        System.out.println("There is the constructor");
    }
    void ConstructorWithReturn(){
        System.out.println("There is the method");
    }
}

class ConstructorWithReturnTest{
    public static void main(String[] args) {
        ConstructorWithReturn constructorWithReturn = new ConstructorWithReturn();
    }
}
