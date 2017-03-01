package com.example.jorge.supletorio;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.widget.ImageButton;

public class CartaDelay  implements   Runnable {
    public  int cartaDesde ;
    private int cartaHasta ;
    private  boolean ocultar ;
    private Activity contexto ;

    public void setCartaDesde(int cartaDesde) {
        this.cartaDesde = cartaDesde;
    }

    public void setCartaHasta(int cartaHasta) {
        this.cartaHasta = cartaHasta;
    }

    public void setOcultar(boolean ocultar) {
        this.ocultar = ocultar;
    }

    public CartaDelay(Activity  ctx ) {
        this.contexto =  ctx ;
    }

    @Override
    public void run() {
        if(ocultar) {
            ocultarColorCartas();
        }else{
            restaurarColorCartas();
        }
    }

    public void ocultarColorCartas(){
        ((ImageButton)contexto.findViewById(cartaDesde)).setBackgroundColor(Color.WHITE);
        ((ImageButton)contexto.findViewById(cartaHasta)).setBackgroundColor(Color.WHITE);
    }
    public void restaurarColorCartas(){
        ((ImageButton)contexto.findViewById(cartaDesde)).setBackgroundResource(R.drawable.back);
        ((ImageButton)contexto.findViewById(cartaHasta)).setBackgroundResource(R.drawable.back);

    }
}
