package com.company;

public class Viniluri { // avem si viniluri in biblioteca noastra
    private String artistVinil;
    private String genVinil;
    private Integer anVinil;

    public Viniluri(String artist, String gen,Integer an){
        this.artistVinil = artist;
        this.genVinil = gen;
        this.anVinil = an;
    }

    public String getArtist(){
        return artistVinil;
    }

    public String getGen(){
        return genVinil;
    }

    public Integer getAn(){
        return anVinil;
    }

    public void setArist(String artist){
        this.artistVinil = artist;
    }

    public void setGen(String gen){
        this.genVinil = gen;
    }

    public void setAn(Integer an){
        this.anVinil = an;
    }

    @Override
    public String toString(){
        return "Vinil: " + artistVinil + " " + genVinil + " " + anVinil;
    }
}
