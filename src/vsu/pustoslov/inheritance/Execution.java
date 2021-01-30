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

        AbstractPost[] arrOfAbstractPosts = {textPost1, picture1, music1, video1, gif1};

        for (AbstractPost abstractPost : arrOfAbstractPosts) {
            abstractPost.showContent();
            abstractPost.showMaxSizeOfPost();

            if (abstractPost instanceof TextPost) {
                ((TextPost)abstractPost).printPost();
                ((TextPost)abstractPost).printNumberOfWords();
            }

            if (abstractPost instanceof  Printable) {
                ((Printable) abstractPost).printPost();
            }

            if (abstractPost instanceof Playable) {
                ((Playable) abstractPost).play();
            }

            if (abstractPost instanceof Media) {
                ((Media)abstractPost).printRealSize();
            }

            if (abstractPost instanceof Music) {
                ((Music)abstractPost).printTrackDuration();
            }

            if (abstractPost instanceof Picture) {
                ((Picture)abstractPost).printBlackAndWhitePicture();
            }

            if (abstractPost instanceof Video) {
                ((Video)abstractPost).printResolution();
            }

            System.out.println("----------------------------");
        }
    }
}