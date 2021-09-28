package lesson25;

public class InterfaceLearning implements Interface1, Interface2{
    public void abc(){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        InterfaceLearning i = new InterfaceLearning();
//        System.out.println(i.a);
        i.abc();
        System.out.println(((Interface1)i).a);
        ((Interface1)i).abc();
    }

}

interface Interface1{
    int a = 5;
    void abc();
}

interface Interface2{
    int a = 10;
    void abc();
}
