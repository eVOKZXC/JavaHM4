package ru.mirea.Panferov.task2;

public enum Sizes {
    XXS(32), XS(34), S(36), M(38), L(40);
    private final int euroSize;
    Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(Sizes size){
        if (size == XXS) return "Детский размер";
        return "Взрослый размер";
    }
}


