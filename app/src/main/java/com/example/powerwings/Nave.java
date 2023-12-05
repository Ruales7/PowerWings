package com.example.powerwings;

public class Nave {

    private int naveX, naveY, currentFrame, velocity;
    public static int maxFrame;

    public Nave (){
        naveX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getNaveWidth()/2;
        naveY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getNaveHeight()/2;
        currentFrame = 0;
        maxFrame = 3;
        velocity = 0;
    }


    public int getVelocity(){
        return velocity;
    }

    public void setVelocity(int velocity){
        this.velocity = velocity;
    }

    public int getCurrentFrame(){
        return currentFrame;
    }
    //obtem o método para o marco atual

    public void setCurrentFrame(int currentFrame){
        this.currentFrame = currentFrame;
    }
    //estabelece o método para o marco atual

    public int getX (){
        return naveX;
    }

    public int getY (){
        return naveY;
    }

    public void setX(int naveX){
        this.naveX = naveX;
    }

    public void setY(int naveY){
        this.naveY = naveY;
    }

}
