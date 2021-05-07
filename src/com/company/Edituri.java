package com.company;

public class Edituri {
    private String numeEditura;
    private Integer anEditura;
    private String adresaEditura;

    public Edituri(String nume, Integer an, String adresa) {
        this.numeEditura = nume;
        this.anEditura = an;
        this.adresaEditura = adresa;
    }

    public String getNume(){
        return numeEditura;
    }

    public Integer getAn(){
        return anEditura;
    }

    public String getAdresa(){
        return adresaEditura;
    }

    public void setNume(String nume){
        this.numeEditura = nume;
    }

    public void setAn(Integer an){
        this.anEditura = an;
    }

    public void setAdresa(String adresa){
        this.adresaEditura = adresa;
    }

    @Override
    public String toString() {
        return "Editura: " + numeEditura + " " + anEditura.toString() + " " + adresaEditura;
    }

}
