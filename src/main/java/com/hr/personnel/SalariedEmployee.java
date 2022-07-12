package com.hr.personnel;


import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate localdate) {
        super(name, localdate);
    }

    public SalariedEmployee(String name, LocalDate localdate, double monthlySalary) {
        super(name, localdate);
        this.monthlySalary = monthlySalary;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getComputeMontlyCompensation() {
        return getMonthlySalary();
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlySalary * SALARIED_TAX_RATE;
    }
}