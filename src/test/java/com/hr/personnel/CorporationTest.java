package com.hr.personnel;

import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {

    @Test
    public void computeMonthlyTaxToPay() {
        Corporation corporation = new Corporation("Johnson & Johnson", 1_000_000);
        double monthlyTaxToPay = corporation.computeMonthlyTaxToPay();
        assertEquals(100_000, monthlyTaxToPay, .01);

    }
}