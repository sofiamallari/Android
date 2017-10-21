package com.example.sofia.fun;

import java.util.Random;

public class FactBook {
    private String[] mFacts= {"Cast all your anxiety on him because he cares for you. /n - 1 Peter 5:7","Fact #2","Fact #3"};
    public String get(){
        String fact = "";
        Random generator=new Random();
        int rndgenerator= generator.nextInt(mFacts.length);
        fact= mFacts[rndgenerator];

        return fact;
    }
}
