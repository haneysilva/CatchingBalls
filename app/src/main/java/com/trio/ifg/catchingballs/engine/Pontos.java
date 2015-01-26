package com.trio.ifg.catchingballs.engine;

/**
 * Created by aluno on 26/01/2015.
 */
public class Pontos {

    static int pontos = 0;

    public static void setPontos(int p) {

        pontos = pontos + p;
    }

    public static int getPontos() {

        return pontos;
    }
}
