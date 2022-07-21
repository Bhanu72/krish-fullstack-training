package com.company;

public class Main {

    public static void main(String[] args) {

        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.showMessage();
    }
}
