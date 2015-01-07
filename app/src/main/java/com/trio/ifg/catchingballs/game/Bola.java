package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.trio.ifg.catchingballs.R;
import com.trio.ifg.catchingballs.engine.GameObject;

/**
 * Created by Haney on 07/01/2015.
 */
public class Bola extends GameObject {

    Paint paint = new Paint();
    Bitmap imagem;

    private int passoX = 4, passoY = 4;

    public Bola(Context context, int x, int y) {
        super(context, x, y);

        imagem = BitmapFactory.decodeResource(getResources(), R.drawable.bola);
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

    public void onTouch() {

        //Criar aqui o que acontecerá com a bola quando ela for tocada
    }
}
