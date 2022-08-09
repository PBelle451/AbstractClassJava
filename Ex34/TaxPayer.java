package co.pedrobelle.curso.Ex34;

public abstract class TaxPayer {
    private String name;
    private double annualincome;

    public TaxPayer(String name, double annualincome) {
        this.name = name;
        this.annualincome = annualincome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualincome() {
        return annualincome;
    }

    public void setAnnualincome(double annualincome) {
        this.annualincome = annualincome;
    }

    public abstract double tax();
}
