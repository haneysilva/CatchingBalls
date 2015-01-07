package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.trio.ifg.catchingballs.engine.GameObject;

/**
 * Created by Haney on 07/01/2015.
 */
public class Fundo extends GameObject {

    public Fundo(Context context, int x, int y) {
        super(context, x, y);
    }

    @Override
    public void step(Canvas canvas) {
        //NULL
    }

    @Override
    public void draw(Canvas canvas) {
        //colocar os fundos aqui
        canvas.drawColor(Color.BLACK);
    }
}
