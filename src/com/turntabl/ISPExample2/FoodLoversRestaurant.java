package com.turntabl.ISPExample2;

public class FoodLoversRestaurant implements ChineseFoodRestaurant,SeafoodRestaurant{
    @Override
    public void ChineseFood() {
        System.out.println("provide Hotpot and Chow Mein");

    }

    @Override
    public void seafood() {
        System.out.println("provide Prawn sesame toast and lobster malay curry");
    }
}
