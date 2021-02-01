package vsu.pustoslov.inheritance;

import java.util.Date;

public class Picture extends Media implements Printable {
    private final boolean itIsBlackAndWhitePicture;

    public Picture(String creator, Date date, TypeOfMessage typeOfMessage, int realSize,
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