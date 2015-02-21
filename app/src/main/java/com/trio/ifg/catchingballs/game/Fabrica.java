package com.trio.ifg.catchingballs.game;

import java.util.ArrayList;

import com.trio.ifg.catchingballs.R;
import com.trio.ifg.catchingballs.game.Bola;

/**
 * Created by aluno on 02/02/2015.
 */
public class Fabrica {

    public static ArrayList<Bola> novaListaDeBolas () {

        ArrayList<Bola> listaDeBolas = new ArrayList<Bola>();
        
        Bola bola1 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(1, bola1);

        Bola bola2 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(2, bola2);

        Bola bola3 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(3, bola3);

        Bola bola4 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(4, bola4);

        Bola bola5 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(5, bola5);

        Bola bola6 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(6, bola6);

        Bola bola7 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(7, bola7);

        Bola bola8 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(8, bola8);

        Bola bola9 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(9, bola9);

        Bola bola10 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(10, bola10);

        Bola bola11 = new Bola(null , 10, 10, R.drawable.bola);
        listaBolas.add(11, bola11);


        return listaDeBolas;
    }
}
