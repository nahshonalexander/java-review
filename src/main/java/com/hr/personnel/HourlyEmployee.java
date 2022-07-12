package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate localdate) {
        super(name, localdate);
    }

    public HourlyEmployee(String name, LocalDate localdate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, localdate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getEmployeeInfo(){
        return "name =" + getName() +
                "hireDate = " + getLocaldate();

    }

    @Override
    public double getComputeMontlyCompensation() {
        double i = (getHoursWorkedPerMonth()* getHourlyRate());
        return i;
    }


    @Override
    public double computeMonthlyTaxToPay() {
        return HOURLY_TAX_RATE * getComputeMontlyCompensation();
    }
}