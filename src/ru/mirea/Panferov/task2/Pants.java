package ru.mirea.Panferov.task2;

public class Pants extends Clothes implements WomenClothing, MenClothing{

    public Pants(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина купил штаны: " + Pants.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");
    }

    @Override
    public void dressWomen() {
        System.out.println("Девушка купила штанишки: " + Pants.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");
    }
}
