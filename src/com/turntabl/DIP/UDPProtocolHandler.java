package com.turntabl.DIP;

public class UDPProtocolHandler implements ProtocolHandler{
    @Override
    public void sendMessage(String message) {
        System.out.println("UDP sending message " + message);

    }
}
