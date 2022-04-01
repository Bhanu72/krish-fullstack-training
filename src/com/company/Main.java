package com.company;

public class Main {

    public static void main(String[] args) {
	Calculater s = (x,y) -> x+y;
    s.sum(10,20);

        System.out.println( s.sum(10,20));
    }
}
