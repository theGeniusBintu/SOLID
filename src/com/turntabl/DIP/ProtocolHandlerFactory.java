package com.turntabl.DIP;
/**Details depend on Abstraction which is the interface ProtocolHandler**/
public class ProtocolHandlerFactory {
    public static ProtocolHandler getProtocolHandler(String protocol){
        if ("TCP".equalsIgnoreCase(protocol)){
            return new TCPProtocolHandler();
        }

        if ("UDP".equalsIgnoreCase(protocol)){
            return new UDPProtocolHandler();
        }

        return null;
    }
}
