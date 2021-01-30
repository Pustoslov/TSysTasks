package vsu.pustoslov.inheritance;

import java.util.Calendar;

public class TextPost extends AbstractPost implements Printable {
    private final int numberOfWords;

    public TextPost(String creator, Calendar date, TypeOfMessage typeOfMessage, int numberOfWords, String message) {
        super(creator, date, typeOfMessage, message);
        this.numberOfWords = numberOfWords;
    }

    public void printNumberOfWords() {
        System.out.println("Number of words in this post: " + numberOfWords);
    }

    @Override
    public void showMaxSizeOfPost() {
        System.out.println("Max size of post: " + 10 + " Mb");
    }

    @Override
    public void printPost() {
        System.out.println("Thanks for reading!");
    }
}