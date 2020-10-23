package com.company;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ExceptionTooMany, IOException {

        Main m1 = new Main();

        Osoba Mirek = new Osoba("Mirek", "Lupa", "12345678910", "Kołataja", "16-11-1960", "21-06-2016");
        Osoba Szymon = new Osoba("Szymon", "Wygański", "5637383910", "Mickiewicza", "26-07-1953", "13-04-2019");
        Osoba Marek = new Osoba("Marek", "Kazubs", "19345978919", "Piekna", "13-01-1970", "14-04-2013");
        Osoba Sławomir = new Osoba("Sławomir", "Lemisz", "92365676910", "Pogodna", "22-07-1955", "18-10-2010");
        Osoba Mateusz = new Osoba("Mateusz", "Pakusz", "12345674914", "Bezu", "01-10-1971", "26-02-2009");


        Pomieszczenie pom1 = new Pomieszczenie(40);
        Pomieszczenie pom2 = new Pomieszczenie(60);
        Pomieszczenie pom3 = new Pomieszczenie(70);
        Pomieszczenie pom4 = new Pomieszczenie(100);
        Pomieszczenie pom5 = new Pomieszczenie(55);
        Pomieszczenie pom6 = new Pomieszczenie(73);
        Pomieszczenie pom7 = new Pomieszczenie(62);
        Pomieszczenie pom8 = new Pomieszczenie(87);
        Pomieszczenie pom9 = new Pomieszczenie(47);
        Pomieszczenie pom10 = new Pomieszczenie(54);


        ArrayList<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(Mirek);
        listaOsob.add(Szymon);
        listaOsob.add(Sławomir);
        listaOsob.add(Marek);
        listaOsob.add(Mateusz);

        Mirek.dodajPomieszczenie(pom1);
        Mirek.dodajPomieszczenie(pom2);

        Szymon.dodajPomieszczenie(pom3);
        Szymon.dodajPomieszczenie(pom4);
        Szymon.dodajPomieszczenie(pom5);

        Sławomir.dodajPomieszczenie(pom6);

        Marek.dodajPomieszczenie(pom7);

        Mateusz.dodajPomieszczenie(pom8);
        Mateusz.dodajPomieszczenie(pom9);
        Mateusz.dodajPomieszczenie(pom10);

        Scanner myObj = new Scanner(System.in);


        Magazyn magazyn = new Magazyn();
        magazyn.listaPomieszczen.add(pom1);
        magazyn.listaPomieszczen.add(pom2);
        magazyn.listaPomieszczen.add(pom3);
        magazyn.listaPomieszczen.add(pom4);
        magazyn.listaPomieszczen.add(pom5);
        magazyn.listaPomieszczen.add(pom6);
        magazyn.listaPomieszczen.add(pom7);
        magazyn.listaPomieszczen.add(pom8);
        magazyn.listaPomieszczen.add(pom9);
        magazyn.listaPomieszczen.add(pom10);



        String[] imiona = {"Cofnij", "Mirek", "Szymon", "Marek", "Sławomir", "Mateusz", "Zakończ"};

        int userName = 0;
        int pytanie = 0;
        int pomieszczenie = 0;
        int zobaczymy = 0;
        int coCheszZrobic = 0;
        int jakaRzecz = 0;


try {
    while (true) {
        switch (pytanie) {
            case 0:
                System.out.println("wybierz imie");
                System.out.println("1)Mirek");
                System.out.println("2)Szymon");
                System.out.println("3)Marek");
                System.out.println("4)Sławomir");
                System.out.println("5)Mateusz");
                System.out.println("6)Zakoncz i zapisz");


                userName = Integer.parseInt(myObj.nextLine());
                if (userName == 6) {
                    String filePath = "/Users/Maqurix/IdeaProjects/stanMagazynu.txt";
                    FileWriter fileWriter = null;

                    try {
                        fileWriter = new FileWriter(filePath);
                        for(Osoba o : listaOsob) {
                            fileWriter.write(String.valueOf(o));
                            fileWriter.write(System.getProperty("line.separator"));
                            fileWriter.write(System.getProperty("line.separator"));
                                for(Pomieszczenie p : listaOsob.get(listaOsob.indexOf(o)).listaPomieszczen){
                                    fileWriter.write(String.valueOf(p));
                                    fileWriter.write(System.getProperty("line.separator"));
                                    fileWriter.write(System.getProperty("line.separator"));
                                    int i=0;
                                    for(Pojazd pp : listaOsob.get(listaOsob.indexOf(o)).listaPomieszczen.get(i).listaPojazdow){
                                        fileWriter.write(String.valueOf(pp));
                                        fileWriter.write(System.getProperty("line.separator"));
                                        fileWriter.write(System.getProperty("line.separator"));
                                    }
                                }

                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                    }
                    System.exit(0);
                }
                pytanie++;
                break;
            case 1:
                System.out.println("Które pomieszczenie wybierasz ?");
                for (int i = 0; i < listaOsob.get(userName - 1).listaPomieszczen.size(); i++) {
                    System.out.println((i + 1) + ")" + listaOsob.get(userName - 1).listaPomieszczen.get(i));
                }
                System.out.println("6)Cofnij");
                System.out.println("7)Zakoncz");
                pomieszczenie = Integer.parseInt(myObj.nextLine());
                if (pomieszczenie == 6) {
                    pytanie--;
                } else if (pomieszczenie == 7) {
                    System.exit(0);
                } else if (pomieszczenie < listaOsob.size()) {
                    pytanie++;
                }
                break;
            case 2:
                System.out.println("Zawartosć pomieszczenia " + listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1) + listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow);
                System.out.println("Co chcesz zrobić w " + listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1));
                System.out.println("1)Dodac rzeczy");
                System.out.println("2)Wyjąć rzeczy");
                System.out.println("3)Zakoncz");
                System.out.println("4)Cofnij");
                coCheszZrobic = Integer.parseInt(myObj.nextLine());
                if (coCheszZrobic == 1 || coCheszZrobic == 2) {
                    pytanie++;
                } else if (coCheszZrobic == 3) {
                    System.exit(0);
                } else if (coCheszZrobic == 4) {
                    pytanie--;
                }else if(coCheszZrobic>=5){
                    System.err.println("Wprowadzono błedne dane!!! ");
                    System.exit(0);
                }
                break;
            case 3:

                if(jakaRzecz>=6){
                    System.err.println("Wprowadzono błedne dane!!! ");
                }
                System.out.print("Co chcesz ");
                if (coCheszZrobic == 1) {
                    System.out.println("dodac");
                    System.out.println("1) Rower");
                    System.out.println("2) Motor");
                    System.out.println("3) Samochód");
                    System.out.println("4)Zakoncz");
                    System.out.println("5)Cofnij");
                    jakaRzecz = Integer.parseInt(myObj.nextLine());
                    if (jakaRzecz == 4) {
                        System.exit(0);
                    } else if (jakaRzecz == 5) {
                        pytanie--;
                    } else if (jakaRzecz == 1) {
                        System.out.println("Podaj nazwę roweru: ");
                        Scanner scan = new Scanner(System.in);
                        String name = scan.nextLine();
                        System.out.println("Podaj rozmiar roweru w 'm3: ");
                        int size = Integer.parseInt(scan.nextLine());
                        System.out.println("Podaj ilosc przerzutek: ");
                        int przerzutki = Integer.parseInt(scan.nextLine());

                        listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).dodajPojazd(new Rower(name, size, przerzutki));
                        System.out.println(listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow);

                        break;
                    } else if (jakaRzecz == 2) {
                        System.out.println("Podaj nazwę motocyklu: ");
                        Scanner scan = new Scanner(System.in);
                        String name = scan.nextLine();
                        System.out.println("Podaj rozmiar motocykla w 'm3: ");
                        int size = Integer.parseInt(scan.nextLine());
                        System.out.println("Czy posiada homologacje? ");
                        String homo = scan.nextLine();

                        listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).dodajPojazd(new Motocykl(name, size, homo));
                        System.out.println(listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow);
                        break;
                    } else if (jakaRzecz == 3) {
                        System.out.println("Podaj nazwę samochodu: ");
                        Scanner scan = new Scanner(System.in);
                        String name = scan.nextLine();
                        System.out.println("Podaj rozmiar samochodu w 'm3': ");
                        int size = Integer.parseInt(scan.nextLine());
                        System.out.println("Podaj rodzaj paliwa samochodu: benzyna, diesel, hybryda");
                        String gas = scan.nextLine();


                        listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).dodajPojazd(new Samochód(name, size, gas));
                        System.out.println(listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow);
                        break;
                    }
                    break;
                } else if (coCheszZrobic == 2) {
                    System.out.println("wyjac : ");
                         for(int i=0;i<listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size();i++){
                             System.out.println(i+") "+listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.get(i));
                          }
                    System.out.println(listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size()+") Zakoncz");
                    System.out.println(listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size()+1+") Cofnij");

                    jakaRzecz = Integer.parseInt(myObj.nextLine());
                    if (jakaRzecz == (listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size())) {
                        System.exit(0);
                    } else if (jakaRzecz == (listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size()+1)) {
                        pytanie--;
                    } else if (jakaRzecz>0 || jakaRzecz<listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.size()) {
                        listaOsob.get(userName - 1).listaPomieszczen.get(pomieszczenie - 1).listaPojazdow.remove(jakaRzecz);
                        break;
                    }
                }

        }
    }

}catch (Exception e){
    System.err.println("Wprowadzono błedne dane!!! ");
}

    }

    }





