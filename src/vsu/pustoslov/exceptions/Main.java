package vsu.pustoslov.exceptions;

import vsu.pustoslov.commons.ConsoleReader;
import vsu.pustoslov.exceptions.myExceptions.AlreadyLoadException;
import vsu.pustoslov.exceptions.myExceptions.EmptyLoadException;
import vsu.pustoslov.exceptions.myExceptions.RunningException;

public class Main {
    public static void main(String[] args) {
        final ConsoleReader consoleReader = new ConsoleReader();
        final int limitOfDishes = consoleReader.readInt("Enter limit of dishes: ");
        final int dishesToLoad = consoleReader.readInt("Enter number of dishes to wash: ");

        final DishWasher dishWasher = new DishWasher(limitOfDishes, dishesToLoad);

        dishWasher.loadDishes();
        dishWasher.startWashing();
        dishWasher.stopWashing();
        dishWasher.getDishes();
        System.out.println("-------------------------");

        try {
            dishWasher.startWashing();
        } catch (EmptyLoadException e) {
            System.out.println("Load machine firstly, please.");
        }
        System.out.println("-------------------------");

        try {
            dishWasher.stopWashing();
        } catch (RunningException e) {
            System.out.println("Machine isn't working, try again.");
        }
        System.out.println("-------------------------");

        try {
            dishWasher.getDishes();
        } catch (EmptyLoadException e) {
            System.out.println("Machine is empty, sorry.");
        }
        System.out.println("-------------------------");

        try {
            dishWasher.loadDishes();
            dishWasher.startWashing();
            dishWasher.startWashing();
        } catch (RunningException e) {
            System.out.println("Machine still working.");
        } finally {
            System.out.println("------Finally block------");
            dishWasher.stopWashing();
            dishWasher.getDishes();
        }
        System.out.println("-------------------------");

        try {
            dishWasher.loadDishes();
            dishWasher.startWashing();
            dishWasher.loadDishes();
        } catch (AlreadyLoadException e) {
            System.out.println("Machine is full already.");
        } finally {
            System.out.println("------Finally block------");
            dishWasher.stopWashing();
            dishWasher.getDishes();
        }
        System.out.println("-------------------------");


        try {
            dishWasher.loadDishes();
            dishWasher.loadDishes();
        } catch (AlreadyLoadException e) {
            System.out.println("You've already loaded dishes.");
        }
        System.out.println("-------------------------");
    }
}