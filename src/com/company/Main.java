package com.company;

public class Main {

    public static void main(String[] args) {
	Employee emp1 = (fname,lname,department) -> fname+lname+department;
    emp1.details("Kamal ", "Perera " ,"HR-Department");

        System.out.println(emp1.details("Kamal ", "Perera " ,"HR-Department"));
    }
}
