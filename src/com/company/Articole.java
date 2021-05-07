package com.company;

public class Articole extends Carti{ // articole stiintifice
    private String domeniuArticol;

    public Articole(String nume, String autor, String gen, Integer an, String editura, String domeniu) {
        super(nume, autor, gen, an, editura);
        this.domeniuArticol = domeniu;
    }

    public String getDomeniu(){
        return domeniuArticol;
    }

    public void setDomeniu(String domeniu){
        this.domeniuArticol = domeniu;
    }

    @Override
    public String toString() {
        return super.toString() + " " + domeniuArticol;
    }

}
