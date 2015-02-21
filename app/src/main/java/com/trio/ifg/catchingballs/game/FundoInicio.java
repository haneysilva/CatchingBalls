package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.trio.ifg.catchingballs.R;
import com.trio.ifg.catchingballs.engine.GameObject;

/**
 * Created by Haney on 07/01/2015.
 */
public class FundoInicio extends GameObject {
    Bitmap imagem;

    public FundoInicio(Context context, int x, int y) {
        super(context, x, y);
        imagem = BitmapFactory.decodeResource(getResources(), R.drawable.telateste);
    }

    @Override
    public void step(Canvas canvas) {
        //NULL
    }

    @Override
    public void draw(Canvas canvas) {
        //colocar os fundos aqui
        canvas.drawBitmap(imagem, 0, 0, null);
    }
}
