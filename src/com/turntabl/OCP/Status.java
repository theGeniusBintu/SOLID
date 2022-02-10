package com.turntabl.OCP;

public class Status implements AppleProductUser{
    private String parent;
    private String fame;


    public String getParent() {
        return parent;
    }

    public String getFame() {
        return fame;
    }

    public Status(String parent, String fame){
        this.parent = parent;
        this.fame = fame;
    }


    @Override
    public void haveMoney(boolean rich) {
        if(rich)
            System.out.println("Uses an apple product");
        else
            System.out.println("Don't worry, all is vanity!");
    }
}
