package lesson4;

public class BankAccount {
    int id = 10;
    //String name = "Vasya";
    String name = new String ("Vasya");
    double balance = 100;
}
    class BankAccountTest {

        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Kate";
            MyAccount.balance = 12.35;

            YourAccount.id = 2;
            YourAccount.name = "Mike";
            YourAccount.balance = 2.00;

            HisAccount.id = 3;
            HisAccount.name = "Ivan";
            HisAccount.balance = 124.12;

            System.out.println(MyAccount.id);
        }
    }
