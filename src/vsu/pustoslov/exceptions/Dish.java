package vsu.pustoslov.exceptions;

public class Dish {
    private TypesOfDishes dish;
    private boolean dirty;

    public Dish(TypesOfDishes dish, boolean dirty) {
        this.dish = dish;
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    @Override
    public String toString() {
        return "Dish: " + dish + ", dirty: " + dirty;
    }
}