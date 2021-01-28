package vsu.pustoslov.inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Execution {
    public static void main(String[] args) {
        TextPost textPost1 = new TextPost("Tom", new GregorianCalendar(2017, Calendar.DECEMBER, 20),
                TypeOfMessage.POST, 523, "Hello world");
        Picture picture1 = new Picture("John", new GregorianCalendar(2020, Calendar.APRIL, 1),
                TypeOfMessage.COMMENT, 5, false, "Hey, do u see this mem?");
        Music music1 = new Music("Kate", new GregorianCalendar(2019, Calendar.AUGUST, 19),
                TypeOfMessage.POST, 12, 360, "Just listen it, so sick!");
        Video video1 = new Video("Ann", new GregorianCalendar(2020, Calendar.MAY, 15),
                TypeOfMessage.REPOST, 25, 720, "I love this video");
        Media gif1 = new Media("Masha", new GregorianCalendar(2018, Calendar.JANUARY, 7),
                TypeOfMessage.POST, 1, "Lol");

        showContent(textPost1);
        textPost1.printNumberOfWords();
        textPost1.printPost();
        System.out.println();

        showContent(picture1);
        printRealSizeOfMedia(picture1);
        picture1.printBlackAndWhitePicture();
        picture1.printPost();
        System.out.println();

        showContent(music1);
        printRealSizeOfMedia(music1);
        music1.printTrackDuration();
        music1.play();
        System.out.println();

        showContent(video1);
        video1.printResolution();
        video1.play();
        System.out.println();

        showContent(gif1);
        printRealSizeOfMedia(gif1);
        System.out.println();
    }

    private static void showContent(AbstractPost abstractPost) {
        abstractPost.showContent();
        abstractPost.showMaxSizeOfPost();
    }

    private static void printRealSizeOfMedia(Media media) {
        media.printRealSize();
    }
}