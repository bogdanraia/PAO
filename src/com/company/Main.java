package com.company;

import java.util.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        Servicii servicii = new Servicii();
        ArrayList<Carti> carti = servicii.getCartiServicii();

        Carti ninety84 = new Carti("1984", "George Orwell", "Distopian", 1949, "Secker & Warburg");
        Carti animalFarm = new Carti("Animal Farm", "George Orwell", "Satire", 1945, "Secker & Warburg");
        Carti burmeseDays = new Carti("Burmese Days", "George Orwell", "Novel", 1934, "Harper & Brothers");
        Carti circe = new Carti ("Circe", "Madeline Miller", "Fantasy", 2018, "Little, Brown and Company");
        Carti hobbit = new Carti ("The Hobbit", "J.R.R.Tolkien", "Fantasy", 1937, "George Allen & Unwin");

        carti.add(ninety84);
        carti.add(animalFarm);
        carti.add(burmeseDays);
        carti.add(circe);
        carti.add(hobbit);

        ArrayList<Carti> fantasy = servicii.getCartiDinGenul("Fantasy");
        for(Carti carte : fantasy)
            System.out.println(carte.toString());
        System.out.println("");

        ArrayList<Carti> sw = servicii.getCartiEditura("Secker & Warburg");
        for(Carti carte : sw)
            System.out.println(carte.toString());
        System.out.println("");

        ArrayList<Carti> georgeO = servicii.getCartiAutor("George Orwell");
        for(Carti carte : georgeO)
            System.out.println(carte.toString());
        System.out.println("");

        for(Carti carte : carti)
            System.out.println(carte.toString());
        System.out.println("");
        servicii.sortCarti();;
        for(Carti carte : carti)
            System.out.println(carte.toString());
        System.out.println("");

        ArrayList<Autori> autori = servicii.getAutoriServicii();
        Autori george = new Autori("George Orwell",LocalDate.of(1903, 06, 25));
        Autori madeline = new Autori("Madeline Miller", LocalDate.of(1978, 7, 24));
        Autori agatha = new Autori("Agatha Christie", LocalDate.of(1890, 9, 15));

        autori.add(george);
        autori.add(madeline);
        autori.add(agatha);

        ArrayList<Autori> nineties = servicii.getAutoriDupaDataNastere(1900);
        for(Autori autor : nineties)
            System.out.println(autor.toString());
        System.out.println("");

        Articole polytopesNP = new Articole("Left-Characteristic Polytopes and Problems in Number Theory", "I. Zhou", "Stintific", 2011, "", "Matematica");
    }
}
