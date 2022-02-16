package com.turntabl.ISP;

public class Rusty implements Sing, Dance {

    @Override
    public void niceVoice() {
        System.out.println("Maybe you have a nice voice, but can you really sing?");
    }

    @Override
    public void stepDance() {
        System.out.println("Do you even know what that means lol");
    }
}
