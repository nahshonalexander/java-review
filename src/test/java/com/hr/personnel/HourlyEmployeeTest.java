package com.hr.personnel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    @Test
    public void computeMonthlyTaxToPay() {
        HourlyEmployee abel = new HourlyEmployee("abel",
                LocalDate.of(2022, 1, 1),
                30,
                30);
        double monthlyTaxToPay = abel.computeMonthlyTaxToPay();
        assertEquals(225.0,monthlyTaxToPay, .01);

    }
}