package com.turntabl.DIP;
/**Low level module**/
public class TCPProtocolHandler implements ProtocolHandler{
    @Override
    public void sendMessage(String message) {
        System.out.println("TCP sending message " + message);
    }
}
