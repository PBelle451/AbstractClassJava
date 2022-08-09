package co.pedrobelle.curso.Ex34;

public class Individual extends TaxPayer{
    private double healthExpentures;

    public Individual(String name, double annualincome, double healthExpentures) {
        super(name, annualincome);
        this.healthExpentures = healthExpentures;
    }

    public double getHealthExpentures() {
        return healthExpentures;
    }

    public void setHealthExpentures(double healthExpentures) {
        this.healthExpentures = healthExpentures;
    }

    @Override
    public double tax() {
        if (getAnnualincome() < 20000.0){
            return getAnnualincome() * 0.15 - healthExpentures * 0.5;
        }
        else {
            return getAnnualincome() * 0.25 - healthExpentures * 0.5;
        }
    }
}
