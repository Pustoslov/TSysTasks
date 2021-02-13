package vsu.pustoslov.exceptions;

import vsu.pustoslov.commons.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        final ConsoleReader consoleReader = new ConsoleReader();
        final int dishesToLoad = consoleReader.readInt("Enter number of dishes to wash: ");

        final DishWasher dishWasher = new DishWasher(dishesToLoad);

        dishWasher.loadDishes();
        dishWasher.startWashing();
        dishWasher.stopWashing();
        dishWasher.getDishes();
        System.out.println("-------------------------\n");

        dishWasher.loadDishes();
        dishWasher.getDishes();
        System.out.println("-------------------------\n");

        try {
            dishWasher.startWashing();
        } catch (IllegalStatusException e) {
            System.out.println("Load machine firstly, please.");
        }
        System.out.println("-------------------------\n");

        try {
            dishWasher.startWashing();
        } catch (IllegalStatusException e) {
            System.out.println("Machine isn't working, try again.");
        }
        System.out.println("-------------------------\n");

        try {
            dishWasher.getDishes();
        } catch (IllegalStatusException e) {
            System.out.println("Machine is empty, sorry.");
        }
        System.out.println("-------------------------\n");

        try {
            dishWasher.loadDishes();
            dishWasher.startWashing();
            dishWasher.startWashing();
        } catch (IllegalStatusException e) {
            System.out.println("Machine still working.");
        }
        System.out.println("-------------------------\n");

        try {
            dishWasher.loadDishes();
            dishWasher.startWashing();
            dishWasher.loadDishes();
        } catch (IllegalStatusException e) {
            System.out.println("Machine is full already.");
        }
        System.out.println("-------------------------\n");

        try {
            dishWasher.loadDishes();
            dishWasher.loadDishes();
        } catch (IllegalStatusException e) {
            System.out.println("You've already loaded dishes.");
        }
        System.out.println("-------------------------\n");
    }
}