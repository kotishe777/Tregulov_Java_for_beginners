package lesson15;

public class WhileLoopThird {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while(b){
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0){
                b = false;
            }
            a++;
        }

        int c = 5;
        while(c++ < 10){
            c++;
        }
        System.out.println(c);

        int d = 5;
        while(d == 10){
            System.out.println("Hi!");
        }

    }
}
