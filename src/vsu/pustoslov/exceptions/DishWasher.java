package vsu.pustoslov.exceptions;

public class DishWasher implements Washable {
    private static final int LIMIT_OF_DISHES = 10;

    private final int dishesToLoad;
    private Status status;
    private final Dish[] arrOfDishes;

    /**
     * Setting the dishWasher.
     *
     * @param dishesToLoad number of dishes to wash.
     * @throws IllegalArgumentException if limitOfDishes < 0.
     */
    public DishWasher(int dishesToLoad) {
        checkPossibleDishesToLoad(dishesToLoad);
        arrOfDishes = new Dish[dishesToLoad];

        this.dishesToLoad = dishesToLoad;
    }

    private void checkPossibleDishesToLoad(int dishesToLoad) {
        if (dishesToLoad <= 0 || LIMIT_OF_DISHES < dishesToLoad) {
            throw new IllegalArgumentException("Sorry, limit of dishes to wash from 1 to " + LIMIT_OF_DISHES
                    + ". When you wanna load: " + dishesToLoad);
        }
    }

    /**
     * LoadDishes method is used to load dishes to dish washer,
     * it also displays status of working process.
     *
     * @throws IllegalStatusException if dish washer not empty or machine is working.
     */
    @Override
    public void loadDishes() {
        if (status == Status.LOADED || status == Status.WORKING) {
            status = Status.ERROR;
            System.out.println("-------Status: " + status);
            throw new IllegalStatusException();
        }

        TypesOfDishes[] typesOfDishes = TypesOfDishes.values();
        for (int i = 0; i < dishesToLoad; i++) {
            arrOfDishes[i] = new Dish(typesOfDishes[(int) (Math.random() * typesOfDishes.length)], true);
            System.out.println("Dirty dishes in washer total: " + i);
            System.out.println(arrOfDishes[i]);
        }

        status = Status.LOADED;
        System.out.println("-------Status: " + status);
    }

    /**
     * startWashing method is used to start washing dishes in dish washer,
     * it also displays status of working process.
     *
     * @throws IllegalStatusException if machine is empty or still working.
     */
    @Override
    public void startWashing() {
        if (status == Status.WORKING || status == Status.UNLOADED) {
            status = Status.ERROR;
            System.out.println("-------Status: " + status);
            throw new IllegalStatusException();
        }

        for (Dish everyDish : arrOfDishes) {
            everyDish.setDirty(false);
        }

        status = Status.WORKING;
        System.out.println("-------Status: " + status);
    }

    /**
     * stopWashing method is used to stop working of dish washer,
     * it also displays status of working process.
     *
     * @throws IllegalStatusException if machine isn't working.
     */
    @Override
    public void stopWashing() {
        if (status == Status.WORKING) {
            status = Status.STOPPED;
            System.out.println("-------Status: " + status);
        } else {
            status = Status.ERROR;
            System.out.println("-------Status: " + status);
            throw new IllegalStatusException();
        }
    }

    /**
     * getDishes method is used to get dishes from dish washer,
     * also displays status of working process.
     *
     * @throws IllegalStatusException if machine is empty or still working.
     */
    @Override
    public void getDishes() {
        if (status == Status.UNLOADED || status == Status.WORKING) {
            status = Status.ERROR;
            System.out.println("-------Status: " + status);
            throw new IllegalStatusException();
        }

        int dirtyDishes = 0;
        for (Dish everyDish : arrOfDishes) {
            if (everyDish.isDirty()) {
                dirtyDishes++;
            }
            everyDish = null;
        }

        status = Status.UNLOADED;
        System.out.println("Number of dirty dishes: " + dirtyDishes);
        System.out.println("-------Status: " + status);
    }
}