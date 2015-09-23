package dip.lab1.student.solution1;

import dip.lab1.student.solution1.Employee;

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

    private void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    private double getAnnualSalary() {
        return annualSalary;
    }

    private void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    private double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public double getAnnualWage() {
        return annualBonus + annualSalary;
    }
}
