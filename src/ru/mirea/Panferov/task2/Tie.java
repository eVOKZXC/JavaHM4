package ru.mirea.Panferov.task2;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина купил галстук: " + Tie.this.size + " размера, стоймостью - " + cost + " рублей, " + color + " цвета");

    }
}
