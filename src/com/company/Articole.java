package com.company;

public class Articole extends Carti{ // articole stiintifice
    private String domeniuArticol;

    Articole(String nume, String autor, String gen, int an, String editura, String domeniu) {
        super(nume, autor, gen, an, editura);
        this.domeniuArticol = domeniu;
    }
}
