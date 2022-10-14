package ru.mirea.Panferov.task2;

abstract public class Clothes {
    protected Sizes size;
    protected int cost;
    protected String color;

    public Clothes(Sizes size, int cost, String color) {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }
}
