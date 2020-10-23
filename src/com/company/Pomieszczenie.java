package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pomieszczenie   {

    static int counter=1;
    int id;
    private int rozmiar;
    int iloscWolnego;


     ArrayList<Pojazd> listaPojazdow = new ArrayList<>();

     public void dodajPojazd(Pojazd p) throws ExceptionTooMany {
         if(this.iloscWolnego<p.getRozmiar()){
             throw new ExceptionTooMany();
         }
         this.listaPojazdow.add(p);
         this.iloscWolnego-=p.getRozmiar();

     }
     /*
     public void usunPojazd(int i){
         this.listaPojazdow.remove(i);
         this.iloscWolnego+=p
     }
*/
    public Pomieszczenie(int rozmiar) {
        this.iloscWolnego=rozmiar;
        this.rozmiar = rozmiar;
        id=counter;
        counter++;

    }

    @Override
    public String toString() {
        return "Pomieszczenie"+id+"{" +
                "rozmiar=" + rozmiar +
                '}';
    }


}
