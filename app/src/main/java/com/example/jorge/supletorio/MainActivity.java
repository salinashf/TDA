package com.example.jorge.supletorio;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.Map;
public class MainActivity extends Activity {
    MapaCartas  mapa   =  new   MapaCartas ();
    private Handler mHandler = new Handler();
    private CartaDelay cartaDelay =  new CartaDelay(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsignarClick();
        CargarCartas();
        Button  bnt   =  (Button )findViewById(R.id.btnNuevoJuego);
        bnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                nuevoJuego();
            }
        });


    }

    public  void  nuevoJuego(){
        ((ImageButton)findViewById(R.id.btn1)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn2)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn3)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn4)).setBackgroundResource(R.drawable.back);

        ((ImageButton)findViewById(R.id.btn5)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn6)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn7)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn8)).setBackgroundResource(R.drawable.back);

        ((ImageButton)findViewById(R.id.btn9)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn10)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn11)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn12)).setBackgroundResource(R.drawable.back);

        ((ImageButton)findViewById(R.id.btn13)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn14)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn15)).setBackgroundResource(R.drawable.back);
        ((ImageButton)findViewById(R.id.btn16)).setBackgroundResource(R.drawable.back);

        for(Map.Entry<Integer, Carta> cartas : mapa.entrySet()) {
            cartas.getValue().setDibujada(false);
            cartas.getValue().setHabilitada(true);
        }
        mapa.encerarClick();

    }



    public   void  AsignarClick() {
        // asignar  el mismo controlado al   manejar del  on click
        findViewById(R.id.btn1).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn2).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn3).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn4).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn5).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn6).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn7).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn8).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn9).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn10).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn11).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn12).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn13).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn14).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn15).setOnClickListener(globalOnClickListener);
        findViewById(R.id.btn16).setOnClickListener(globalOnClickListener);
    }


    public  void CargarCartas()
    {
        mapa.put(R.id.btn1 , new Carta(Carta.Tipo.HAZ, Carta.Color.ROJO, Carta.Simbolo.CORAZONES, R.drawable.ac)) ;
        mapa.put(R.id.btn2 , new Carta(Carta.Tipo.HAZ, Carta.Color.NEGRO, Carta.Simbolo.CORAZONES, R.drawable.ae)) ;
        mapa.put(R.id.btn3 , new Carta(Carta.Tipo.TRES, Carta.Color.ROJO, Carta.Simbolo.BRILO, R.drawable.b3)) ;
        mapa.put(R.id.btn4 , new Carta(Carta.Tipo.SEIS, Carta.Color.ROJO, Carta.Simbolo.BRILO, R.drawable.b6)) ;

        mapa.put(R.id.btn5 , new Carta(Carta.Tipo.TRES, Carta.Color.ROJO, Carta.Simbolo.CORAZONES, R.drawable.c3)) ;
        mapa.put(R.id.btn6 , new Carta(Carta.Tipo.OCHO, Carta.Color.NEGRO, Carta.Simbolo.CORAZONES, R.drawable.e8)) ;
        mapa.put(R.id.btn7 , new Carta(Carta.Tipo.CINCO, Carta.Color.NEGRO, Carta.Simbolo.TREBOL, R.drawable.t5)) ;
        mapa.put(R.id.btn8 , new Carta(Carta.Tipo.OCHO, Carta.Color.NEGRO, Carta.Simbolo.TREBOL, R.drawable.t8)) ;

        mapa.put(R.id.btn9 , new Carta(Carta.Tipo.HAZ, Carta.Color.ROJO, Carta.Simbolo.CORAZONES, R.drawable.ac)) ;
        mapa.put(R.id.btn10 , new Carta(Carta.Tipo.HAZ, Carta.Color.NEGRO, Carta.Simbolo.CORAZONES, R.drawable.ae)) ;
        mapa.put(R.id.btn11 , new Carta(Carta.Tipo.TRES, Carta.Color.ROJO, Carta.Simbolo.BRILO, R.drawable.b3)) ;
        mapa.put(R.id.btn12 , new Carta(Carta.Tipo.SEIS, Carta.Color.ROJO, Carta.Simbolo.BRILO, R.drawable.b6)) ;

        mapa.put(R.id.btn13 , new Carta(Carta.Tipo.TRES, Carta.Color.ROJO, Carta.Simbolo.CORAZONES, R.drawable.c3)) ;
        mapa.put(R.id.btn14 , new Carta(Carta.Tipo.OCHO, Carta.Color.NEGRO, Carta.Simbolo.CORAZONES, R.drawable.e8)) ;
        mapa.put(R.id.btn15 , new Carta(Carta.Tipo.CINCO, Carta.Color.NEGRO, Carta.Simbolo.TREBOL, R.drawable.t5)) ;
        mapa.put(R.id.btn16 , new Carta(Carta.Tipo.OCHO, Carta.Color.NEGRO, Carta.Simbolo.TREBOL, R.drawable.t8)) ;
    }

    public View.OnClickListener globalOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            if (mapa.get(v.getId()).isHabilitada()){
                CambiarImagen(v.getId());
            }
        }
    };
    public  void VerificarCartas(int cartaDesde, int cartaHasta){
        Carta desde  = mapa.get(cartaDesde) ;
        cartaDelay.setCartaDesde(cartaDesde);
        cartaDelay.setCartaHasta(cartaHasta);

        if (desde.equals(mapa.get(cartaHasta))){
            Toast.makeText(getApplicationContext(), getApplicationContext().getString(R.string.correcto), Toast.LENGTH_LONG).show();
            cartaDelay.setOcultar(true);
            mHandler.postDelayed(cartaDelay, 500);
            //ocultarColorCartas(cartaDesde, cartaHasta);
            mapa.get(cartaDesde).setHabilitada(false);
            mapa.get(cartaHasta).setHabilitada(false);
        }else{
            cartaDelay.setOcultar(false);
            mHandler.postDelayed(cartaDelay, 500);
            //restaurarColorCartas(cartaDesde, cartaHasta);

            mHandler.postDelayed(cartaDelay, 500);
            mapa.get(cartaDesde).setDibujada(false);
            mapa.get(cartaHasta).setDibujada(false);
        };
    }





    public  void  CambiarImagen(int   recurso){
        if (!mapa.get(recurso).isDibujada()){
            ImageButton img =   (ImageButton)findViewById(recurso) ;
            mapa.get(recurso).setDibujada(true);
            img.setBackgroundResource( mapa.get(recurso).getImgFondo());
            mapa.asignarClick(recurso);
            if (mapa.isCompletosClick()){
                int  cartaInicio =  mapa.getCartaInicio();
                int  cartaFin =  mapa.getCartaFinal();
                VerificarCartas(cartaInicio,cartaFin);
                mapa.encerarClick();
            }
        }
    }
}
