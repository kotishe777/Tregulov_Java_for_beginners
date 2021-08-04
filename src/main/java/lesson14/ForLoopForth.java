package lesson14;

public class ForLoopForth {

    public static void main(String[] args) {
    for(int i = 1; i <= 10; i++){
        if(i == 7){
            break;
        }
        System.out.println(i);
        }
        for(int i = 1; i <= 100; i++){
            if(i == 26){
                continue;
            }
        System.out.println(i);
        }
    }
}
