package com.evenodds.evenodds;

import java.util.Random;

public class RandomStringGenerator {
    public String getRandomString(){

        Random theGenerator = new Random();
        int random = theGenerator.nextInt(50)+1;
        String a = "";
        for(int k=0; k<random; k++){
            a += "a";
        }
        return a;
    }
}
