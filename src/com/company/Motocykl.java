package com.company;


public class Motocykl extends Pojazd {
    private String name;
    private String homologacja;

    public Motocykl(String name, int rozmiar, String homologacja) {
        super(rozmiar);
        this.name=name;
        this.homologacja = homologacja;
    }


    @Override
    public String toString() {
        return "Motocykl{" +
                "marka='" + name + '\'' +
                ", rozmiar=" + getRozmiar() +
                ", homologacja=" + homologacja +
                '}';
    }
}