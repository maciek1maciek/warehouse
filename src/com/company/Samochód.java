package com.company;

import java.util.ArrayList;

public class Samochód extends Pojazd {

    private String paliwo;
    private String marka;


    public Samochód(String marka, int rozmiar, String paliwo) {
        super(rozmiar);
        this.paliwo = paliwo;
        this.marka=marka;
    }




    @Override
    public String toString() {
        return "Samochód{" +
                "marka=" + marka +
                ", rozmiar='" + getRozmiar() + '\'' +
                ", paliwo='" + paliwo + '\'' +
                '}';
    }
}
