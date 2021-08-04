package lesson17;

public class Homework17 {

    public boolean equality(StringBuilder sb1, StringBuilder sb2){
        boolean equalityCheck = true;
        if (sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    equalityCheck = false;
                }
            }
        } else {
            equalityCheck = false;
        }
        return equalityCheck;
    }

    public static void main(String[] args) {
        Homework17 hm17 = new Homework17();
        System.out.println(hm17.equality(new StringBuilder("hello "), new StringBuilder("hello")));
    }
}
