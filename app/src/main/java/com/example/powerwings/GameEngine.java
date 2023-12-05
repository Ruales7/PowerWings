package com.example.powerwings;

import android.graphics.Canvas;

public class GameEngine {

    BackgroundImage backgroundImage;

    Nave nave;

    static int gameState;

    public GameEngine (){

        backgroundImage = new BackgroundImage();
        nave = new Nave();

        //0 = jogo parado
        //1 = jogando
        //2 = GameOver
        gameState = 0;
    }

    public void updateAndDrawableBackgroundImage(Canvas canvas){
        if(gameState == 1){
            if (nave.getY() < (AppConstants.SCREEN_HEIGHT - AppConstants.getBitmapBank().getNaveHeight())
            || nave.getVelocity() < 0){
                nave.setVelocity(nave.getVelocity() + AppConstants.gravity);
                nave.setY(nave.getY() + nave.getVelocity());
            }
        }

        backgroundImage.setX(backgroundImage.getX() - backgroundImage.getVelocity());
        if (backgroundImage.getX() <- AppConstants.getBitmapBank().getBackgroundWidth()){
            backgroundImage.setX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getJdfundodois(), backgroundImage.getX(),
                backgroundImage.getY(), null);

        if(backgroundImage.getX() <- (AppConstants.getBitmapBank().getBackgroundWidth() - AppConstants.SCREEN_WIDTH)){
            canvas.drawBitmap(AppConstants.getBitmapBank().getJdfundodois(), backgroundImage.getX()+
                    AppConstants.getBitmapBank().getBackgroundWidth(),backgroundImage.getY(), null);
        }
    }

    public void updateAndDrawNave(Canvas canvas){
        int currentFrame = nave.getCurrentFrame();
        canvas.drawBitmap(AppConstants.getBitmapBank().getNave(currentFrame), nave.getX(), nave.getY(), null);
        currentFrame++;

        if (currentFrame > nave.maxFrame){
            currentFrame = 0;
        }

        nave.setCurrentFrame(currentFrame);
    }
}
