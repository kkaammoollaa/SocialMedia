package com.company.telegramm;

public class Chatting implements Telegramm {
    @Override
    public void SendMessage() {
        System.out.println("Hello everyone");
    }

    @Override
    public void Calling() {
        System.out.println("audio or video");
    }

    @Override
    public void OpenCanel(){
        System.out.println("Useful for people");
    }
}
