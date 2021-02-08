package vsu.pustoslov.exceptions.myExceptions;

public class EmptyLoadException extends RuntimeException{

    public EmptyLoadException() {
        super();
    }

    public EmptyLoadException(String message) {
        super(message);
    }
}