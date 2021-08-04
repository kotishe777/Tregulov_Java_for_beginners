package lesson5;

public class Human {
  String name;
  Car3 car;
  BankAccount bankAccount;


  void info(){
    System.out.println("name: " + name + " car color: " + car.color + " balance of bank account: " + bankAccount.balance);
  }

  void accountActivities(){
    System.out.println(bankAccount.accountReplenishment(100));
    System.out.println(bankAccount.accountWithdrawal(200));
  }

}

class HumanTest{

  public static void main(String[] args) {
    Human human = new Human();
    human.name = "Aleksandr";
    human.car = new Car3("red","V6");
    human.bankAccount = new BankAccount(10, 10000.5);
    human.info();
    human.accountActivities();
  }
}

class Car3 {

  Car3(String c, String e){
    color = c;
    engine = e;
  }
  String color;
  String engine;
}

class BankAccount{
  BankAccount(int id2, double balance2){
    id = id2;
    balance = balance2;
  }
  int id;
  double balance;

  double accountReplenishment(double sum2) {
  balance += sum2;
    return balance;
  }

  double accountWithdrawal(double sum2) {
    balance -= sum2;
    return balance;
  }

}
