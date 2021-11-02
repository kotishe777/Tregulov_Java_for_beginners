package lesson27;

public class ErrorsLearning {

    static void abc(){
        System.out.println("abc Method is working");
        abc();
    }

    public static void main(String[] args) {
        try{
        abc();
        }
        catch (StackOverflowError s){
            System.out.println("Error is caught");
        }
    }
}
