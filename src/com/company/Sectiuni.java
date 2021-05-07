package com.company;

import java.util.*;

public class Sectiuni {
    private String numeSectiune;
    private List<Carti> cartiSectiune;

    public Sectiuni(String nume, List<Carti> carti){
        this.numeSectiune = nume;
        this.cartiSectiune = carti;
    }

    public String getNume(){
        return numeSectiune;
    }

    public List<Carti> getCarti(){
        return cartiSectiune;
    }

    public void setNume(String nume){
        this.numeSectiune = nume;
    }

    public void setCarti(List<Carti> carti){
        this.cartiSectiune = carti;
    }

    @Override
    public String toString(){
        return "Sectiune: " + numeSectiune + " " + cartiSectiune;
    }
}
