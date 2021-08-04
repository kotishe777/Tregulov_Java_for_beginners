package lesson21;

public class MethodWithParameterIntAcceptsChar {

    void abc (int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        MethodWithParameterIntAcceptsChar withParameterIntAcceptsChar = new MethodWithParameterIntAcceptsChar();
        char c = 'a';
        withParameterIntAcceptsChar.abc(c);
    }
}
