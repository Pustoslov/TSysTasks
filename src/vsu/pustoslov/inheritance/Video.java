package vsu.pustoslov.inheritance;

import java.util.Calendar;

public class Video extends Media {
    private final int resolution;


    public Video(String creator, Calendar date, TypeOfMessage typeOfMessage, int realSize, int resolution,
                 String message) {
        super(creator, date, typeOfMessage, realSize, message);
        this.resolution = resolution;
    }

    public void printResolution() {
        System.out.println("Resolution: " + resolution);
    }
}