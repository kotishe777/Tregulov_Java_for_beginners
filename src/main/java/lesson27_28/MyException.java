package lesson27_28;

public class MyException {
    void marathon(int airTemperature, int runningPace) throws SprainFootException{
        if (runningPace > 12){
            throw new SprainFootException("Running pace was to high" + runningPace);
        }
        if (airTemperature > 32){
            throw new ContractedMuscleException();
        }
        System.out.println("You ran the marathon");
    }

    public static void main(String[] args) {
        MyException t = new MyException();
        try {
            t.marathon(20, 8);
        } catch (SprainFootException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You get the prize anyway");
        }
    }
}

class SprainFootException extends Exception{

    SprainFootException (String message){
        super(message);
    }
    SprainFootException(){}
}

class ContractedMuscleException extends RuntimeException{

    ContractedMuscleException (String message){
        super(message);
    }
    ContractedMuscleException(){}
}
