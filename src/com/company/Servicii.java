package com.company;

import java.util.*;

public class Servicii {
    private ArrayList<Carti> cartiServicii;
    private ArrayList<Autori> autoriServicii;

    public Servicii() {
        cartiServicii = new ArrayList<Carti>();
        autoriServicii = new ArrayList<Autori>();
    }

    public ArrayList<Carti> getCartiServicii(){
        return cartiServicii;
    }

    public ArrayList<Autori> getAutoriServicii(){
        return autoriServicii;
    }

    public ArrayList<Carti> getCartiDinGenul(String gen){
        ArrayList<Carti> carti = new ArrayList<Carti>();
        for (Carti carte : cartiServicii) {
            if (carte.getGen() == gen)
                carti.add(carte);
        }
        return carti;
    }

    public ArrayList<Carti> getCartiEditura(String editura){
        ArrayList<Carti> carti = new ArrayList<Carti>();
        for (Carti carte : cartiServicii) {
            if (carte.getEditura() == editura)
                carti.add(carte);
        }
        return carti;
    }

    public ArrayList<Carti> getCartiAutor(String autor){
        ArrayList<Carti> carti = new ArrayList<Carti>();
        for (Carti carte : cartiServicii) {
            if (carte.getAutor() == autor)
                carti.add(carte);
        }
        return carti;
    }

    public ArrayList<Carti> getCartiInainteDeAnul(Integer an){
        ArrayList<Carti> carti = new ArrayList<Carti>();
        for (Carti carte : cartiServicii) {
            if (carte.getAn() < an)
                carti.add(carte);
        }
        return carti;
    }

    public ArrayList<Autori> getAutoriDupaDataNastere(Integer an){ // obtine toti autorii nasccuti dupa un anumit an
        ArrayList<Autori> autori = new ArrayList<Autori>();
        for (Autori autor : autoriServicii) {
            if (autor.getDN().getYear() >= an)
                autori.add(autor);
        }
        return autori;
    }

    public void sortCarti(){ // sortare dupa lungimea numelui
        Collections.sort(cartiServicii);
    }
}
