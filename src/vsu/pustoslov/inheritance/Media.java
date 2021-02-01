package vsu.pustoslov.inheritance;

import java.util.Date;

public class Media extends AbstractPost {
    private final int realSize;

    public Media(String creator, Date date, TypeOfMessage typeOfMessage, int realSize, String message) {
        super(creator, date, typeOfMessage, message);
        this.realSize = realSize;
    }

    public void printRealSize() {
        System.out.println("Size of this media: " + realSize + " Mb");
    }

    @Override
    public void showMaxSizeOfPost() {
        System.out.println("Max size of post: " + 50 + " Mb");
    }
}