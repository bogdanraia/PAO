package com.company;

import java.util.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        Carti ninety84 = new Carti("1984", "George Orwell", "Distopian", 1949, "Secker & Warburg");
        Carti animalFarm = new Carti("Animal Farm", "George Orwell", "Satire", 1945, "Secker & Warburg");
        Carti burmeseDays = new Carti("Burmese Days", "George Orwell", "Novel", 1934, "Harper & Brothers");
        Carti circe = new Carti ("Circe", "Madeline Miller", "Fantasy", 2018, "Little, Brown and Company");

        Autori george = new Autori("George Orwell",LocalDate.of(1903, 06, 25));
        Autori madeline = new Autori("Madeline Miller", LocalDate.of(1978, 7, 24));
        Autori agatha = new Autori("Agatha Christie", LocalDate.of(1890, 9, 15));

        List<Carti> cartiClasice = new ArrayList();
        cartiClasice.add(animalFarm);
        cartiClasice.add(burmeseDays);
        cartiClasice.add(ninety84);
        Sectiuni clasice = new Sectiuni("Clasice", cartiClasice);
        System.out.println(clasice.toString());

        System.out.println(cartiClasice.toString());
        Collections.sort(cartiClasice);
        System.out.println(cartiClasice.toString());

        Articole polytopesNP = new Articole("Left-Characteristic Polytopes and Problems in Number Theory", "I. Zhou", "Stintific", 2011, "", "Matematica");
        System.out.println(ninety84.getAn());

    }
}
