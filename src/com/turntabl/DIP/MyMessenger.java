package com.turntabl.DIP;

/**High level module depends on abstraction and not directly on low level module**/
public class MyMessenger {

    ProtocolHandler handler;

    public MyMessenger(String protocol){
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }
    public void send(String receiver, String message){
        handler.sendMessage("to " + receiver + ": " + message);
    }
}
