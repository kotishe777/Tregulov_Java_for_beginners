package lesson22;

public class Human {
    final String sex;
    private String name;
    private int age;
    private int weight;
    private boolean clever;

    public Human(String sex) {
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int i){
        if (i > 0) {
            age = i;
        }
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int i){
        if (i > 0) {
            weight = i;
        }
    }

    public boolean isClever(){
        return clever;
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName("Nick");
        human.setAge(20);
        human.setWeight(65);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
        human.setWeight(-30);
        System.out.println(human.getWeight());
    }
}
