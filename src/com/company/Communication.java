package com.company;

import com.company.facebook.Facebook;

public class Communication implements Facebook {
    @Override
    public void FindFriends() {
        System.out.println("Find new friends");
    }

    @Override
    public void ReadInformation() {
        System.out.println("necessary and useful");
    }

    @Override
    public void PostPhoto() {
         System.out.println("with friends");
    }
}
