package com.trio.ifg.catchingballs.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by Haney on 07/01/2015.
 */
public abstract class GameObject extends View {

    protected int height, width, x, y;

    protected GameObject(Context context, int x, int y) {
        super(context);

        this.x = x;
        this.y = y;
    }

    public abstract void step(Canvas canvas);
    public abstract void draw(Canvas canvas);

    public Rect getRect() {
        return new Rect(x, y, x+height, y+width);
    }
}
