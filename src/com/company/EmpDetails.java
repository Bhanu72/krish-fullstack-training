package com.company;

public class EmpDetails implements Employee{
    @Override
    public String details(String fname, String lname, String department) {
        return fname+lname+department;
    }
}
