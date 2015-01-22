package com.trio.ifg.catchingballs.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Haney on 07/01/2015.
 */
public abstract class GameController extends SurfaceView implements Runnable  {

    private Thread thread;
    private boolean running = false;
    private SurfaceHolder holder;
    private int vidas;
    private int velocidade;

    public GameController(Context context) {
        super(context);

        holder = getHolder();
    }

    public GameController(Context context, int vidas, int velocidade) {
        super(context);
        this.vidas = vidas;
        this.velocidade = velocidade;
    }

    public abstract void stepObjects(Canvas canvas);
    public abstract void drawObjects(Canvas canvas);

    public void resume() {

        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public void stop(){
        running = false;
    }

    @Override
    public void run() {

        while(running){

            if(!holder.getSurface().isValid())
                continue;

            Canvas canvas = holder.lockCanvas();

            stepObjects(canvas);
            drawObjects(canvas);

            holder.unlockCanvasAndPost(canvas);
        }
    }
}
