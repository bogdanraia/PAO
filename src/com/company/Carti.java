package com.company;

public class Carti implements Comparable< Carti >{
    private String numeCarte;
    private String autorCarte;
    private String genCarte;
    private Integer anCarte;
    private String edituraCarte;

    public Carti(String nume, String autor, String gen, int an, String editura) {
        this.numeCarte = nume;
        this.autorCarte = autor;
        this.genCarte = gen;
        this.anCarte = an;
        this.edituraCarte = editura;
    }

    public String getNume(){
        return numeCarte;
    }

    public String getAutor(){
        return autorCarte;
    }

    public String getGen(){
        return genCarte;
    }

    public Integer getAn(){
        return anCarte;
    }

    public String getEditura(){
        return edituraCarte;
    }

    public void setNume(String nume){
        this.numeCarte = nume;
    }

    public void setAutor(String autor){
        this.autorCarte = autor;
    }

    public void setGen(String gen){
        this.genCarte = gen;
    }

    public void setAn(Integer an){
        this.anCarte = an;
    }

    public void setEditura(String editura){
        this.edituraCarte = editura;
    }

    @Override
    public int compareTo(Carti o){
        if(this.numeCarte.length() > o.numeCarte.length()) {
            return 1;
        }
        else if (this.numeCarte.length() < o.numeCarte.length()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Carte: " + numeCarte + " " + autorCarte + " " + genCarte + " " + anCarte.toString() + " " + edituraCarte;
    }
}
