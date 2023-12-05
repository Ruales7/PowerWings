package com.example.powerwings;

public class BackgroundImage {

    private int backgroundImageX, backgroundImageY, getBackgroundVelocity;

    public BackgroundImage(){

        backgroundImageX = 0;
        backgroundImageY = 0;
        getBackgroundVelocity = 4;

    }


    //usado para pegar a coordenada do X
    public int getX (){
        return backgroundImageX;
    }

    //usado para pegar a coordenada do Y
    public int getY (){
        return backgroundImageY;
    }

    //método para configurar a coordenada X
    public void setX (int backgroundImageX){
        this.backgroundImageX = backgroundImageX;
    }

    //método para configurar a coordenada X
    public void setY (int backgroundImageY){
        this.backgroundImageY = backgroundImageY;
    }

    //método para obter a velocidade
    public int getVelocity(){
        return getBackgroundVelocity;
    }
}
