package com.trio.ifg.catchingballs.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.trio.ifg.catchingballs.engine.GameController;

import java.util.ArrayList;

/**
 * Created by Haney on 07/01/2015.
 */
public class CatchController1 extends GameController {

    //criar os objetos de jogo aqui
    private Fundo fundo;
    private Placar placar;
    private int pontos;
    private ArrayList<Bola> listaDeBolas;

    public CatchController1(Context context) {
        super(context);

        //inicializar os objetos

        vidas = 3;
        fundo = new Fundo(context, 0, 0);
        placar = new Placar(context, 0, 0);
        listaDeBolas = Fabrica.novaListaDeBolas();
    }

    public CatchController1(Context context, int vidas, int velocidade) {
        super(context, vidas, velocidade);
    }



    @Override
    public void startController() {

    }

    @Override
    public void stepObjects(Canvas canvas) {

        if (vidas != 0) {

            //posicionar os objetos
            fundo.step(canvas);
            placar.step(canvas);

        } else if (vidas == 0) {

            //colocar a imagem que fala que o jogo acabou e qunado clicar nela
            // iniciar o jogo novamente, ou retornar para a tela inicial
        }
    }

    @Override
    public void drawObjects(Canvas canvas) {

        //pintar os objetos
        fundo.draw(canvas);
        placar.draw(canvas, pontos);

        switch (vidas) {

            case 1:
                //desenhar 1 corações
                break;

            case 2:
                //desenhar 2 corações
                break;

            case 3:
                //desenhar 3 corações
                break;

            case 4:
                //desenhar 4 corações
                break;

            case 5:
                //desenhar 5 corações
                break;

            default:
                break;
        }
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {

        boolean aux = false;
        //criar as interações de toque
        //chamar os on touch de cada bola passando o event

        return super.onTouchEvent(event);
    }

    public void adicionarPontos (int p) {
        pontos = pontos + p;
    }

    public int getPontos() {
        return pontos;
    }
}
