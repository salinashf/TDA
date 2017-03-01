package com.example.jorge.supletorio;

import android.os.Handler;

import java.util.HashMap;
import java.util.Vector;
public class MapaCartas   extends HashMap< Integer, Carta> {

    private   int cartaInicio  =-1;
    private   int cartaFinal   =-1 ;
    private   boolean  completosClick  = false;
    private Handler mHandler = new Handler();

    public boolean isCompletosClick() {
        return completosClick;
    }

    public void  encerarClick(){
        setCartaInicio(-1);
        setCartaFinal(-1);
        completosClick =  false;
    }

    public void  asignarClick(int recurso){
        if(getCartaInicio() ==-1){
            setCartaInicio(recurso);
            setCartaFinal(-1);
            completosClick =  false;
        }else if (getCartaFinal() ==-1){
            setCartaFinal(recurso);
            completosClick =  true;
        }
    }

    public int getCartaInicio() {
        return cartaInicio;
    }

    public void setCartaInicio(int cartaInicio) {
        this.cartaInicio = cartaInicio;
    }

    public int getCartaFinal() {
        return cartaFinal;
    }

    public void setCartaFinal(int cartaFinal) {
        this.cartaFinal = cartaFinal;
    }
}
