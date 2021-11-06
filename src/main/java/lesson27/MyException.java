package lesson27;

public class MyException {
    void marathon(int airTemperature, int runningPace) throws SprainFootException{
        if (runningPace > 12){
            throw new SprainFootException("Running pace was to high" + runningPace);
        }
        if (airTemperature > 38){
            throw new ContractedMuscleException();
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
