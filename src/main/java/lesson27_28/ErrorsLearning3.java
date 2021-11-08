package lesson27_28;

public class ErrorsLearning3 {

    void abc(){
        System.out.println("This is abc method");
        throw new StackOverflowError();
    }

    void def(){
        try{
            abc();
            return;
        } finally {
            System.out.println("There is finally block");
        }
    }

    public static void main(String[] args) {
        ErrorsLearning3 t = new ErrorsLearning3();
        t.def();
    }
}
