package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public double getAnnualWage() {
        return annualBonus + annualSalary;
    }
}
