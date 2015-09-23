package dip.lab1.student.solution1;

import dip.lab1.student.solution1.Employee;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    private double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    private void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    private double getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAnnualWage() {
        return hourlyRate * totalHrsForYear;
    }
}
