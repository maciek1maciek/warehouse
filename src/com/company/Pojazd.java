package com.company;

public class Pojazd  {
    String name;
    private int rozmiar;


    public Pojazd(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public int getRozmiar() {
       return this.rozmiar;
    }



    @Override
    public String toString() {
        return "Pojazd{" +
                "name='" + name + '\'' +
                '}';
    }


}
