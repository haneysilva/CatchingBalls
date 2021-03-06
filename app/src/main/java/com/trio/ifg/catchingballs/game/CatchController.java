package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.trio.ifg.catchingballs.engine.GameController;

/**
 * Created by Haney on 07/01/2015.
 */
public class CatchController extends GameController {

    //criar os objetos de jogo aqui
    private Fundo fundo;

    public CatchController(Context context) {
        super(context);

        //inicializar os objetos
        fundo = new Fundo(context, 0, 0);
    }

    @Override
    public void stepObjects(Canvas canvas) {

         //posicionar os objetos
        fundo.step(canvas);
    }

    @Override
    public void drawObjects(Canvas canvas) {

        //pintar os objetos
        fundo.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);

        //criar as interações de toque
    }
}
