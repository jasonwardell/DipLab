package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private double annualBonus;
    
    /** default constructor. Is this the best way to go? */

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
    }

        public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
        
           public double getAnnualSalary() {
        return annualSalary;
    }
           
               public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
               
                   public double getAnnualBonus() {
        return annualBonus;
    }
}
