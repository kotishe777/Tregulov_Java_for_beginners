package lesson15;

public class WhileLoopSecond {
    public static void main(String[] args) {
        int money = 100;

        while (money>10){
            System.out.println("Do bet");
            System.out.println("You lose");
            money = money - 10;
        }
    }
}
