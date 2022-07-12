package gov.irs;

import com.hr.personnel.HourlyEmployee;

public class IRS  {

    private String location;

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public IRS(String location) {
        this.location = location;
    }

    public void register(TaxPayer taxPayer){
        // -receiver Taxpayer object as an arugment
        // - place that Taxpayer object into the first emmpty bucket in array
        taxPayers[currentIndex++] = taxPayer;
        // increment the index,
        // so next time the method is called, it will use the next empty bucket
    }

    public double computeTotalMonthlyTaxToCollect(){
        // - need a variable to collect the taxes
        double totalMontlyTaxesToCollect = 0.0;
        //-for every Taxpayer object in array
        // call computeMontlyTaxToPay method
        // add them up to TotalMonthlyTaxToCollect variable
        for (int i = 0; i < currentIndex; i++) {
            double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
            totalMontlyTaxesToCollect += monthlyTaxToPay;
        }

        return  totalMontlyTaxesToCollect;

    }

    public TaxPayer[] getTaxPayers() {
        return taxPayers;
    }

}