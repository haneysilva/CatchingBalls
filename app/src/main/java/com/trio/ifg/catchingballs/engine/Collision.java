package com.trio.ifg.catchingballs.engine;



import com.trio.ifg.catchingballs.game.Bola;
import com.trio.ifg.catchingballs.game.Fabrica;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustavo on 21/02/2015.
 */
public class Collision{
    

    public Collision() {
    }

    public static void verificarColisao() {

        Fabrica fabricaBola = new Fabrica();

        ArrayList<Bola> listaBolas = fabricaBola.novaListaDeBolas();


        for (int i = 0; i < 12; i++) {
            Bola bola1 = listaBolas.get(i);
            for (int j = 0; j < 12; j++) {
                Bola bola2 = listaBolas.get(j);

                if (bola1 == bola2) {
                    j = j + 1;
                }
                if (bola1.getX() == bola2.getX()) {
                    bola1.inverterX();
                    bola2.inverterX();
                }
                if (bola1.getY() == bola1.getY()) {
                    bola1.inverterY();
                    bola2.inverterY();
                }
            }

        }

    }

