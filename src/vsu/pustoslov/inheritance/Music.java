package vsu.pustoslov.inheritance;

import java.util.Calendar;

public class Music extends Media {
    private final int durationInSecs;

    public Music(String creator, Calendar date, TypeOfMessage typeOfMessage, int realSize, int durationInSecs, String message) {
        super(creator, date, typeOfMessage, realSize, message);
        this.durationInSecs = durationInSecs;
    }

    public void printTrackDuration() {
        System.out.println("Duration of this track: " + durationInSecs);
    }
}