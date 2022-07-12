package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Employee implements TaxPayer {

    private String name;
    private LocalDate localdate;
    private double computeMontlyCompensation;


    public Employee(String name, LocalDate localdate) {
        this.name = name;
        this.localdate = localdate;
    }

    public String getEmployeeInfo(){
        return "name= " + name + " hiredate= " + localdate;
    }

    public String work(){

        return name + " worked";
    }

    public String getName() {
        return name;
    }

    public abstract double getComputeMontlyCompensation();


    public LocalDate getLocaldate() {
        return localdate;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getLocaldate(), employee.getLocaldate());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocaldate());
    }
}