package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

import com.trio.ifg.catchingballs.R;
import com.trio.ifg.catchingballs.engine.GameObject;

/**
 * Created by Gustavo on 21/02/2015.
 */
public class Bola extends GameObject {

    Paint paint = new Paint();
    Bitmap imagem;

    private int passoX = 4, passoY = 4;

    public Bola(Context context, int x, int y, int Idimage) {
        super(context, x, y);

        imagem = BitmapFactory.decodeResource(getResources(), Idimage);
        height = imagem.getHeight();
        width = imagem.getWidth();
    }

    @Override
    public void step(Canvas canvas) {

        int auxH = canvas.getHeight();
        int auxW = canvas.getWidth();

        if(x <= 0 || x >= auxW) inverterX();
        if(y <= 0 || y >= auxH) inverterY();

    }

    private void inverterY() {
        passoY = passoY * (-1);
    }

    private void inverterX() {
        passoX = passoY * (-1);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(imagem, x, y, null);
    }

    public boolean onTouch(MotionEvent event) {

        float xEvent = event.getX();
        float yEvent = event.getY();

        float xBottom = x + width;
        float yBottom = y + height;

        if((xEvent >= x && xEvent <= xBottom) && (yEvent >= y && yEvent <= yBottom)){
            return true;
        } else return false;
    }
}
