package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;

import com.trio.ifg.catchingballs.engine.GameObject;
import com.trio.ifg.catchingballs.engine.Pontos;

/**
 * Created by aluno on 26/01/2015.
 */
public class Placar extends GameObject {


    public Placar(Context context, int x, int y) {
        super(context, x, y);
    }

    @Override
    public void step(Canvas canvas) {

        x = canvas.getWidth() - 50;
        y = 5;
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawText(String.valueOf(Pontos.getPontos()), (float)x, (float)y, null);
    }
}
