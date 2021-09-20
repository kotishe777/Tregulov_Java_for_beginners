package lesson24;

public class InterfaceLearning2 {
}

interface JumpAble{
    void jump();
}

class Human implements JumpAble{
    public void jump(){
        System.out.println("Human jumps");
    }
}

class Animal implements JumpAble{
    public void jump(){
        System.out.println("Animal jumps");
    }
}

interface A1{
    void a();
}

interface B1 extends A1,JumpAble{
    void b();
}

abstract class C1 implements B1 {}
