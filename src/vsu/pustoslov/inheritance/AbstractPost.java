package vsu.pustoslov.inheritance;

import java.util.Date;

public abstract class AbstractPost {
    private final String creator;
    private final Date date;
    private final TypeOfMessage typeOfMessage;
    private final String message;

    public AbstractPost(String creator, Date date, TypeOfMessage typeOfMessage, String message) {
        this.creator = creator;
        this.date = date;
        this.typeOfMessage = typeOfMessage;
        this.message = message;
    }

    public void showContent() {
        System.out.println("Creator: " + creator);
        System.out.println("Date: " + date);
        System.out.println("Type of message: " + typeOfMessage);
        System.out.println("Message: " + message);
    }

    public abstract void showMaxSizeOfPost();
}