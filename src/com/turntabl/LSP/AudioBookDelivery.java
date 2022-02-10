package com.turntabl.LSP;

public class AudioBookDelivery extends OnlineDelivery{

    @Override
    String getSoftwareOptions() {
        super.getSoftwareOptions();
        return "Still online";
    }
}
