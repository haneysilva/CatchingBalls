package com.trio.ifg.catchingballs.engine;

import android.graphics.Rect;

/**
 * Created by Haney on 07/01/2015.
 */
public class Collision{

    public Collision() {
    }

    public static boolean verificarColisao(GameObject a, GameObject b) {

        Rect rA = a.getRect();
        Rect rB = b.getRect();

        return rA.intersect(rB);
    }
}
