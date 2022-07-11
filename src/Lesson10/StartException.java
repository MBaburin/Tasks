package Lesson10;


public class StartException extends Exception{
    public StartException () {
    }

    public StartException (String error, String model){
        System.err.println("Ведро "+model+" не завелось.");
    }
}