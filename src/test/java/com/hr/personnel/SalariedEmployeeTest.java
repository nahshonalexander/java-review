package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyTaxToPay_should_return_correct_tax_value_based_on_tax_rate() {
        SalariedEmployee shon = new SalariedEmployee("shon",
                LocalDate.of(2022, 1, 1),
                1000);
        double monthlyTaxToPay = shon.computeMonthlyTaxToPay();
        Assert.assertEquals(300,monthlyTaxToPay, .01);
    }
}