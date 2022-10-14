package ru.mirea.Panferov.task1;

public class Program {
    static public void main(String[] args){
        Seasons spring = Seasons.Spring;
        System.out.println("Март 31 день в месяце, апрель 30 дней в месяце, май 31 день в месяце.");
        printSeason(spring);
    }

     static public void printSeason(Seasons season){
        switch (season){
            case Winter -> System.out.println("Я люблю зиму");
            case Autumn -> System.out.println("Я люблю осень");
            case Summer -> System.out.println("Я не люблю лето");
            case Spring -> System.out.println("Я люблю весну");
        }
     }
}
