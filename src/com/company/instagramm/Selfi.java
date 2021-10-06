package com.company.instagramm;

public class Selfi implements Instagramm{
    @Override
    public void PostPhoto() {
        System.out.println("remind your happy days");
    }

    @Override
    public void WatchVideo() {
        System.out.println("different videos");
    }

    @Override
    public void EarnMoney() {
         System.out.println("15$ for each videos");
    }
}
