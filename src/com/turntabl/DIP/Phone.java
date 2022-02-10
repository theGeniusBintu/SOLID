package com.turntabl.DIP;

public class Phone {
    private final Screen screen;
    private final Keypad keypad;

    public Phone(Screen screen, Keypad keypad) {
        this.screen = screen;
        this.keypad = keypad;
    }
}

/** public class Windows98Machine{
 private final StandardKeyboard keyboard;
 private final Monitor monitor;

 public Windows98Machine(){
 monitor = new monitor();
 keyboard = new StandardKeyboard();
 }
 }
  */