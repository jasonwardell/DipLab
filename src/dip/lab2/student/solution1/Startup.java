package dip.lab2.student.solution1;

// A useful import if you need it.
import dip.lab2.student.solution1.ServiceTipCalculator;
import dip.lab2.student.solution1.FoodServiceTipCalculator;
import dip.lab2.student.solution1.BaggageServiceTipCalculator;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
 
    public static void main(String[] args) {
        
        TipCalculator bagTipCalc = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.GOOD, 3);
        TipCalculator foodServTipCalc = new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.FAIR, 45.17);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        ServiceTipCalculator servTipCalculator = new ServiceTipCalculator();
        
        
          System.out.println("I tipped the baggage service: " +
            nf.format(servTipCalculator.getTip(bagTipCalc)));
        System.out.println("I tipped the food service: " +
            nf.format(servTipCalculator.getTip(foodServTipCalc)));
        
        
    }

}
