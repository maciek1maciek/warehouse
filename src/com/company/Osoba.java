package com.company;

import java.util.ArrayList;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String adres;
    private String dataU;
    private String dataPierNajmu;

    ArrayList<Pomieszczenie>listaPomieszczen = new ArrayList<>();

    public void dodajPomieszczenie(Pomieszczenie p){
        listaPomieszczen.add(p);
    }

    public Osoba(String imie, String nazwisko, String pesel, String adres, String dataU, String dataPierNajmu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adres = adres;
        this.dataU = dataU;
        this.dataPierNajmu = dataPierNajmu;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adres='" + adres + '\'' +
                ", dataU='" + dataU + '\'' +
                ", dataPierNajmu='" + dataPierNajmu + '\'' +
                '}';
    }

    public String getImie() {
        return imie;
    }

}
