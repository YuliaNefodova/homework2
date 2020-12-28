package com.company;

import java.util.Random;

public class Randomizer {

    Random rand = new Random();

    public void getRandNumber(){
        System.out.println(rand.nextInt());
    }

    public void getRandTenNumbers(){
        String result = "";

        for(int i = 0; i < 10; i++){
            result += String.valueOf(rand.nextInt()) + "  ";
        }
        System.out.println(result);
    }

    public void getRandNumberFromMinToMax(int nMin, int nMax) {
        int nDiff = nMax - nMin;
        int randNum = rand.nextInt(nDiff + 1);
        randNum += nMin;
        System.out.println(randNum);
    }

    public void getRandNumberFromMinToMaxInRange(int amountMin, int amountMax, int nMin, int nMax) {

        String result = " ";


        int dDiff = amountMax - amountMin;
        int amountRandNum = rand.nextInt(dDiff + 1);
        amountRandNum += amountMin;


        int nDiff = nMax - nMin;
        for(int i = 0; i < amountRandNum; i++){
            result += String.valueOf(rand.nextInt((nDiff + 1) + nMin)  + "  " );
        }
        System.out.println(result);
    }

}
