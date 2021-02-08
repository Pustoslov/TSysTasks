package vsu.pustoslov.commons;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner = new Scanner(System.in);

    public int readInt(String lineForPrinting) {
        System.out.print(lineForPrinting);
        return scanner.nextInt();
    }
}