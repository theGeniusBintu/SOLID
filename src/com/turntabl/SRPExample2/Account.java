package com.turntabl.SRPExample2;

public class Account {
    AccountRepository repository = new AccountRepository();
    Notification notification = new Notification();
    public void openAccount(){
        System.out.println("fill account details");
        repository.create();

        notification.sendMessage();
    }
}
