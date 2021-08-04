package lesson21;

public class ReturnLearning {
    int abc(){
        return 5;
    }

    public static void main(String[] args) {
        int a = new ReturnLearning().abc();
        new ReturnLearning().abc();
    }

    int abc2(int i) {
        if (i > 10) {
            return 5;
        } else {
            return 10;
        }
    }

    void abc3(int i2){
        if (i2 > 3){
        return;
        }
        System.out.println("Hello");
    }

}
