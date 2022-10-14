package ru.mirea.Panferov.task2;

public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Девушка купила юбку: " + Skirt.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");
    }
}
