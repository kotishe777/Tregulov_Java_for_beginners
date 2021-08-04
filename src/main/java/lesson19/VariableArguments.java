package lesson19;

public class VariableArguments {
    static void sum (String s, int ... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public void abc(int[]... array){

    }

    public static void main(String[] args) {
        sum("ok",null);
    }
}
