package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {

    private final double goodRate = 0.20;
    private final double fairRate = 0.15;
    private final double poorRate = 0.10;

    private double baseTipPerBag;
    private int bagCount;

    @Override
    public double getServiceTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    public enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    private void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    private ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    private int getBagCount() {
        return bagCount;
    }

    private void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    private double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
