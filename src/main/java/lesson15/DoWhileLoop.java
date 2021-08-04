package lesson15;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);

        int money = 100;

        do{
            System.out.println("Do bet");
            System.out.println("You lost");
            money -= 10;
        } while (money <= 50);
    }
}
