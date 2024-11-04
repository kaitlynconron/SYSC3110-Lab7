public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = base * TAX_RATE;
        return base + tax;
    }

    private double getBase() {
        return _units * _rate;
    }
}
