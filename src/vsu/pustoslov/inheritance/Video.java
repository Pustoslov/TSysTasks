package vsu.pustoslov.inheritance;

import java.util.Date;

public class Video extends Media implements Playable {
    private final int resolution;


    public Video(String creator, Date date, TypeOfMessage typeOfMessage, int realSize, int resolution,
                 String message) {
        super(creator, date, typeOfMessage, realSize, message);
        this.resolution = resolution;
    }

    public void printResolution() {
        System.out.println("Resolution: " + resolution);
    }

    @Override
    public void play() {
        System.out.println("Pleasant viewing");
    }
}