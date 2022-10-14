package ru.mirea.Panferov.task1;

public enum Seasons {
    Autumn(6),
    Winter(-23),
    Spring(13),
    Summer(33);

    private final int temp;

    Seasons(int temp){
        this.temp = temp;
    }

    public int getTemp() { return temp; }

    public String getDescription(){
        if (this.temp == 33) return "Теплое время года";
        return "Холодное время года";
    }
}
