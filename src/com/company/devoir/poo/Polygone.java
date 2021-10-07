package com.company.devoir.poo;

public class Polygone {

    private int cotes;
    private double longueurDeCotes;

    //region Constructeurs
    public Polygone(){

    }

    public Polygone(int cotes, double longueurDeCotes) {
        this.cotes = cotes;
        this.longueurDeCotes = longueurDeCotes;
    }
    //endregion


    @Override
    public String toString() {
        return "Polygone{" +
                "cotes=" + cotes +
                ", longueurDeCotes=" + longueurDeCotes +
                '}';
    }

    //region Getter/Setter
    public int getCotes() {
        return cotes;
    }

    public void setCotes(int cotes) {
        this.cotes = cotes;
    }

    public double getLongueurDeCotes() {
        return longueurDeCotes;
    }

    public void setLongueurDeCotes(double longueurDeCotes) {
        this.longueurDeCotes = longueurDeCotes;
    }
    //endregion
}
