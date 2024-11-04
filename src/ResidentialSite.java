public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = base * TAX_RATE;
        return base + tax;
    }

    private double getBase() {
        return _units * _rate * 0.5;
    }
}
