package com.example.powerwings;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread{

    SurfaceHolder surfaceHolder;
    //Referencia ao objeto Surfaceholder

    boolean isRunning;
    //Marca se o jogo já está sendo executado ou não

    long startTime, loopTime;
    //Hora que inicia o laço e a duração dele

    long DELAY = 33;
    //milisegundos de atraso entre a ação e a tela

    public GameThread (SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
        isRunning = true;

    }

    @Override
    public void run() {
        while (isRunning){
            startTime = SystemClock.uptimeMillis();
            //bloqueio de tela
            Canvas canvas = surfaceHolder.lockCanvas(null);
            if (canvas != null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawableBackgroundImage(canvas);
                    AppConstants.getGameEngine().updateAndDrawNave(canvas);
                    //desbloqueio dessa tela
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            //tempo do looping
            loopTime = SystemClock.uptimeMillis() - startTime;
            //faz uma pausa para ter certeza que está atualizando a quantidade correta de segundos
            if (loopTime < DELAY){
                try{
                    Thread.sleep(DELAY - loopTime);
                }catch (InterruptedException e){
                    Log.e("Interrumped", "Interrompido enquanto abastecia");
                }
            }
        }
    }

    public boolean isRunning(){
        return isRunning;

    }

    public void setRunning(boolean state){
        isRunning = state;
    }
}
