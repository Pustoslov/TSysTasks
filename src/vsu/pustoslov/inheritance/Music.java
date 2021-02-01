package vsu.pustoslov.inheritance;

import java.util.Date;

public class Music extends Media implements Playable {
    private final int durationInSecs;

    public Music(String creator, Date date, TypeOfMessage typeOfMessage, int realSize, int durationInSecs, String message) {
        super(creator, date, typeOfMessage, realSize, message);
        this.durationInSecs = durationInSecs;
    }

    public void printTrackDuration() {
        System.out.println("Duration of this track: " + durationInSecs);
    }

    @Override
    public void play() {
        System.out.println("La-lala-lalala-la");
    }
}