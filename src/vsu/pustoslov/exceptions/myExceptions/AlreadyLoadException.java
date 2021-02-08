package vsu.pustoslov.exceptions.myExceptions;

public class AlreadyLoadException extends RuntimeException {

    public AlreadyLoadException() {
        super();
    }

    public AlreadyLoadException(String message) {
        super(message);
    }
}