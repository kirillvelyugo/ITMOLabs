package Expectations.chechedExceptions;

public class AircraftCrashedException extends Error{
    public AircraftCrashedException (String message){
        super(message);
        System.out.println("Самолет потерпел крушение...\n");


    }
}
