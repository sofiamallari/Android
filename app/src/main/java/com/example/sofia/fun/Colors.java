package com.example.sofia.fun;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by SOFIA on 7/15/2017.
 */

public class Colors {
    private String[] mColors = {"#39add1","#3079ab","#c25975","#838cc7"};
    public int getColor(){
        String color;
        Random generator=new Random();
        int rndgenerator= generator.nextInt(mColors.length);
        color= mColors[rndgenerator];
        int c= Color.parseColor(color);

        return c;
    }
}
