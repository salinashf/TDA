package com.example.jorge.supletorio;

import android.graphics.drawable.Drawable;

public class Carta {
    private boolean  dibujada  =  false;

    public boolean isDibujada() {
        return dibujada;
    }

    public void setDibujada(boolean dibujada) {
        this.dibujada = dibujada;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    private  boolean  habilitada  =   true ;
    public int getImgFondo() {
        return imgFondo;
    }

    public void setImgFondo(int imgFondo) {
        this.imgFondo = imgFondo;
    }

    private int   imgFondo   ;
    public enum Tipo {
        HAZ,  DOS, TRES,CUATRO, CINCO, SEIS ,OCHO,
    }

    public enum Color {
        ROJO, NEGRO
    }

    public enum Simbolo {
        CORAZONES, BRILO ,TREBOL
    }

    private final Tipo tipo;
    private final Color color;
    private final Simbolo simbolo;
    public Carta(Tipo tipo, Color color, Simbolo simbolo , int imgFondo) {
        this.tipo = tipo;
        this.color = color;
        this.simbolo = simbolo;
        this.imgFondo  =  imgFondo;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public Color getColor() {
        return color;
    }
    public Simbolo getSimbolo() {
        return simbolo;
    }



    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Carta) {
            Carta oCarta = (Carta) o;
            result = this.getTipo().equals(oCarta.getTipo());
            result = result && (this.getSimbolo()==null || this.getSimbolo().equals(oCarta.getSimbolo()));
            result = result && (this.getColor()==null || this.getColor().equals(oCarta.getColor()));
        }
        return result;
    }
    public boolean isDos() {
        return Tipo.DOS.equals(tipo);
    }
    public boolean isBrillo() {
        return Simbolo.BRILO.equals(simbolo);
    }
    public boolean isCorazones() {
        return Simbolo.CORAZONES.equals(simbolo);
    }
    public boolean isTrebol() {
        return Simbolo.TREBOL .equals(simbolo);
    }
    public boolean isColor(Color color) {
        return color.equals(this.color);
    }
}