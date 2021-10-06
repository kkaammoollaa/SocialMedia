package com.company;

import com.company.facebook.Facebook;
import com.company.instagramm.Instagramm;
import com.company.instagramm.Selfi;
import com.company.telegramm.Chatting;
import com.company.telegramm.Telegramm;

public class Main {

    public static void main(String[] args) {

        Telegramm telegramm = new Chatting();
        Instagramm instagramm = new Selfi();
        Facebook facebook = new Communication();

        telegramm.OpenCanel();
        instagramm.EarnMoney();
        facebook.FindFriends();
    }
}
