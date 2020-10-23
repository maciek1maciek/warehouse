package com.company;

import java.util.ArrayList;

public class Rower extends Pojazd{
    private int przerzutki;
    private String marka;

    public Rower(String marka, int rozmiar, int przerzutki) {
        super(rozmiar);
        this.marka=marka;
        this.przerzutki = przerzutki;
    }



    @Override
    public String toString() {
        return "Rower{" +
                "marka="+marka+
                ", rozmiar=" + getRozmiar() +
                ", przerzutki=" + przerzutki +
                '}';
    }


}
