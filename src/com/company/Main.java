package com.company;

public class Main {

    public static void main(String[] args) {
        Palindrome sList = new Palindrome();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(1);

        sList.display();

        //Checks whether given list is palindrome or not
        sList.isPalindromeLL();
    }
}
