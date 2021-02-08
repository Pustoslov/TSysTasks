package vsu.pustoslov.exceptions.myExceptions;

public class RunningException extends RuntimeException {

    public RunningException() {
        super();
    }

    private RunningException(String message) {
        super(message);
    }
}