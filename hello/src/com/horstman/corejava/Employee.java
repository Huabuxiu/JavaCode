package com.horstman.corejava;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int mouth ,int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar= new GregorianCalendar(year ,mouth -1 ,day);

        hireDay = calendar.getTime();
    }


    public  void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary +=raise;
    }
    public Date getHireDay() {
        return hireDay;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
