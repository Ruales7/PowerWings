package com.example.powerwings;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap jdfundodois;

    Bitmap [] nave;

    public BitmapBank (Resources resources){
        jdfundodois = BitmapFactory.decodeResource(resources, R.drawable.jdfundodois);
        jdfundodois = scaleImage(jdfundodois);

        nave = new Bitmap[4];
        nave [0] = BitmapFactory.decodeResource(resources, R.drawable.navona2);
        nave [1] = BitmapFactory.decodeResource(resources, R.drawable.navona2);
        nave [2] = BitmapFactory.decodeResource(resources, R.drawable.navona2);
        nave [3] = BitmapFactory.decodeResource(resources, R.drawable.navona2);

    }

    public Bitmap getNave (int frame){
        return nave [frame];
    }

    public int getNaveWidth(){
        return nave [0].getWidth();
    }

    public int getNaveHeight(){
        return nave [0].getHeight();
    }

    //Retorna o fundo bitmap
    public Bitmap getJdfundodois() { return jdfundodois; }

    //Retorna a largura do background
    public int getBackgroundWidth() { return jdfundodois.getWidth(); }

    public int getBackgroundHeight() { return jdfundodois.getHeight(); }

    public Bitmap scaleImage(Bitmap bitmap){
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();

        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT, false);
    }
}
