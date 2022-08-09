package co.pedrobelle.curso.Ex34;

public class Company extends TaxPayer{
    private Integer numberofEmployees;

    public Company(String name, double annualincome, Integer numberofEmployees) {
        super(name, annualincome);
        this.numberofEmployees = numberofEmployees;
    }

    public Integer getNumberofEmployees() {
        return numberofEmployees;
    }

    public void setNumberofEmployees(Integer numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    @Override
    public double tax() {
        if (getNumberofEmployees() > 10){
            return getAnnualincome() * 0.14;
        } else {
            return getAnnualincome() * 0.16;
        }
    }
}
