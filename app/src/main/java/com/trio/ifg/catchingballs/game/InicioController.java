package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.trio.ifg.catchingballs.engine.GameController;

/**
 * Created by Haney on 14/02/2015.
 */
public class InicioController extends GameController {

    private FundoInicio fundo;

    public InicioController(Context context) {
        super(context);

        fundo = new FundoInicio(context, 0, 0);
    }

    @Override
    public void stepObjects(Canvas canvas) {

        //o fundo sempre vai ser pintado no mesmo lugar
    }

    @Override
    public void drawObjects(Canvas canvas) {

        fundo.draw(canvas);
    }

    @Override
    public void startController() {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //chamar a primeira fase

        return super.onTouchEvent(event);
    }
}
