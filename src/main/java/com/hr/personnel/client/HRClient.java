package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Shon",
                LocalDate.of(2022, 4, 13), 20, 10.0);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Langston",
                LocalDate.of(2022, 4, 13), 3000.0);
        salariedEmployee1.setMonthlySalary(65);


        SalariedEmployee salariedEmployee2 = new SalariedEmployee("James Ball",
                LocalDate.of(2022, 4, 13), 7000.0);

        hourlyEmployee1.getEmployeeInfo();


        Department department1 = new Department("engineering", "building1");
        department1.addEmployee(salariedEmployee1);
        salariedEmployee1.getComputeMontlyCompensation();
        department1.addEmployee(salariedEmployee1);
        department1.addEmployee(salariedEmployee2);
        salariedEmployee2.getComputeMontlyCompensation();
        department1.addEmployee(hourlyEmployee1);
        System.out.println(hourlyEmployee1.getComputeMontlyCompensation());






    }

}