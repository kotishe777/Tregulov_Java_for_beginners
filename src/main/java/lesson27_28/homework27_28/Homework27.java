package lesson27_28.homework27_28;

public class Homework27 {

    public static void main(String[] args) {
        Tiger t = new Tiger();

        t.eat("meat");

        try {
            t.drink("water");
            try {
                t.drink("bear");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("There is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotMeatException extends RuntimeException {

    NotMeatException(String message) {
        super(message);
    }
}

class NotWaterException extends RuntimeException {

    NotWaterException(String message) {
        super(message);
    }
}

class Tiger {

    void eat(String food) {
        if (!food.equals("meat")) {
            throw new NotMeatException("Tiger doesn't eat " + food);
        }
        System.out.println("Tiger eats meat");
    }

    void drink(String drink) {
        if (!drink.equals("water")) {
            throw new NotWaterException("Tiger doesn't drink " + drink);
        }
        System.out.println("Tiger drinks water");
    }
}
