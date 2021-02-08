package vsu.pustoslov.exceptions;

import vsu.pustoslov.exceptions.myExceptions.AlreadyLoadException;
import vsu.pustoslov.exceptions.myExceptions.RunningException;
import vsu.pustoslov.exceptions.myExceptions.EmptyLoadException;
import vsu.pustoslov.exceptions.myExceptions.OverloadException;

public class DishWasher implements Washable {
    private final int limitOfDishes;
    private final int dishesToLoad;
    private boolean fullness;
    private boolean running;

    /**
     * Setting the dishWasher.
     *
     * @param limitOfDishes max number of dishes for dish washer.
     * @param dishesToLoad  number of dishes to wash.
     * @throws IllegalArgumentException if limitOfDishes < 0.
     * @throws OverloadException        if number of dishes to wash more than limitOfDishes.
     */
    public DishWasher(int limitOfDishes, int dishesToLoad) {
        this.limitOfDishes = limitOfDishes;
        this.dishesToLoad = dishesToLoad;

        if (!checkLimitAppropriation()) {
            throw new IllegalArgumentException("Limit of dishes for washing must be >= 0");
        }

        if (!checkPossibleDishesToLoad()) {
            throw new OverloadException("Sorry, limit of dishes to wash = " + limitOfDishes);
        }
    }

    private boolean checkLimitAppropriation() {
        return limitOfDishes > 0;
    }

    private boolean checkPossibleDishesToLoad() {
        return dishesToLoad <= limitOfDishes;
    }

    /**
     * LoadDishes method is used to load dishes to dish washer,
     * it also displays status of working process.
     *
     * @throws AlreadyLoadException if dish washer not empty.
     */
    @Override
    public void loadDishes() {
        if (fullness) {
            throw new AlreadyLoadException();
        }
        System.out.println(Status.LOADED);
        fullness = true;
    }

    /**
     * startWashing method is used to start washing dishes in dish washer,
     * it also displays status of working process.
     *
     * @throws EmptyLoadException if machine is empty.
     * @throws RunningException   if machine is still working.
     */
    @Override
    public void startWashing() {
        if (!fullness) {
            throw new EmptyLoadException();
        }
        if (running) {
            throw new RunningException();
        }
        running = true;
        System.out.println(Status.WORKING);
    }

    /**
     * stopWashing method is used to stop working of dish washer,
     * it also displays status of working process.
     *
     * @throws RunningException if machine isn't working.
     */
    @Override
    public void stopWashing() {
        if (!running) {
            throw new RunningException();
        }
        running = false;
        System.out.println(Status.STOPPED);
    }

    /**
     * getDishes method is used to get dishes from dish washer,
     * also displays status of working process.
     *
     * @throws AlreadyLoadException if machine still working.
     * @throws EmptyLoadException   if machine is empty.
     */
    @Override
    public void getDishes() {
        if (running) {
            throw new RunningException();
        }
        if (!fullness) {
            throw new EmptyLoadException();
        }
        System.out.println(Status.UNLOADED);
        fullness = false;
    }
}