package ru.mirea.Panferov.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина купил футболку: " + TShirt.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");
    }

    @Override
    public void dressWomen() {
        System.out.println("Девушка купила футболку: " + TShirt.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");
    }
}
