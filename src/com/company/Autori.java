package com.company;

import java.time.*;

public class Autori {
    private String numeAutor;
    private LocalDate dataAutor; // data nastere

    public Autori() {
        this.numeAutor = "";
        this.dataAutor = null;
    }

    public Autori (String nume, LocalDate data) {
        this.numeAutor = nume;
        this.dataAutor = data;
    }

    public String getNume() {
        return numeAutor;
    }

    public void setNume(String nume) {
        this.numeAutor = nume;
    }

    public LocalDate getDN () {
        return dataAutor;
    }

    public void setDN(LocalDate data) {
        this.dataAutor = data;
    }

    @Override
    public String toString() {
        return "Autor: " + numeAutor + " " + dataAutor;
    }
}
