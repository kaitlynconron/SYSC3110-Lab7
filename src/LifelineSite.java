public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = getTax(base);
        return base + tax;
    }

    private static double getTax(double base) {
        return base * TAX_RATE;
    }

    private double getBase() {
        return _units * _rate;
    }
}
