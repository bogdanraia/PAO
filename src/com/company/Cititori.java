package com.company;

import java.util.*;

public class Cititori {
    private String numeCititor;
    private Integer varstaCititor;
    private String adresaCititor;
    private List<Carti> cartiCititor;

    public Cititori(String nume, Integer varsta, String adresa, List<Carti> carti){
        this.numeCititor = nume;
        this.varstaCititor = varsta;
        this.adresaCititor = adresa;
        this.cartiCititor = carti;
    }

    public String getNume(){
        return numeCititor;
    }

    public Integer getVarsta(){
        return varstaCititor;
    }

    public String getAdresa(){
        return adresaCititor;
    }

    public List<Carti> getCarti(){
        return cartiCititor;
    }

    public void setNume(String nume){
        this.numeCititor = nume;
    }

    public void setVarsta(Integer varsta){
        this.varstaCititor = varsta;
    }

    public void setAdresa(String adresa){
        this.adresaCititor = adresa;
    }

    public void setCarti(List<Carti> carti){
        this.cartiCititor = carti;
    }

    @Override
    public String toString(){
        return "Cititor: " + numeCititor + " " + varstaCititor.toString() + " " + adresaCititor + " " + cartiCititor;
    }
}


