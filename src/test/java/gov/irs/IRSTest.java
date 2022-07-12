package gov.irs;

import com.hr.personnel.Corporation;
import com.hr.personnel.CorporationTest;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


import static org.junit.Assert.*;

public class IRSTest {


    @Test
    public void register(){

    }

    @Test
    public void computeTotalMonthlyTaxToCollect() {

        //- what is our test target class? IRS
        // - you have to create an object of your test target
        IRS usa = new IRS("USA");

        //add Three TaxPayer Objects - 1 salried - 1 hourly -1 corporation
        SalariedEmployee shon = new SalariedEmployee("shon",
                LocalDate.of(2022, 1, 1),
                3000);
        usa.register(shon);

        Corporation corporation = new Corporation("Johnson & Johnson", 3000);
        usa.register(shon);

        HourlyEmployee shon1 = new HourlyEmployee("shon",
                LocalDate.of(2022, 1, 1),
                 40, 40);


        // - you are going to invoke the test target method
        double totalMonthlyTaxToCollect = usa.computeTotalMonthlyTaxToCollect();
        //- and get the return value and assign it to actual value
        // - you need to compute expected value
        double expectedTaxToColledct = 0.0;

        //assert\
        assertEquals(expectedTaxToColledct,totalMonthlyTaxToCollect,.01);



    }
}