package ru.mirea.Panferov.task2;

public class Program{
    static public void main(String[] args){
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(Sizes.S, 3700, "Желтый");
        clothes[1] = new Skirt(Sizes.XXS, 5350, "Розовая");
        clothes[2] = new Tie(Sizes.M, 800, "Черный");
        clothes[3] = new Pants(Sizes.L, 6000, "Светло-серый");
        
    }
}
