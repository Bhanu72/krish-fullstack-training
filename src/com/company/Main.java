package com.company;

public class Main {

    public static void main(String[] args) {
	Employee emp1 = new EmpDetails();
    emp1.details("Kamal" , "Perera" , "HR-Department");

        System.out.println(emp1.details("Kamal " , "Perera " , "HR-Departments"));
    }
}
