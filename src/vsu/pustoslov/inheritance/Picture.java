package vsu.pustoslov.inheritance;

import java.util.Calendar;

public class Picture extends Media implements Post {
    private final boolean itIsBlackAndWhitePicture;

    public Picture(String creator, Calendar date, TypeOfMessage typeOfMessage, int realSize,
                   boolean itIsBlackAndWhitePicture, String message) {
        super(creator, date, typeOfMessage, realSize, message);
        this.itIsBlackAndWhitePicture = itIsBlackAndWhitePicture;
    }

    public void printBlackAndWhitePicture() {
        if (itIsBlackAndWhitePicture) {
            System.out.println("It is black and white picture");
        } else {
            System.out.println("It is colorful picture");
        }
    }

    @Override
    public void printPost() {
        System.out.println("Like and share with your friends please!");
    }
}