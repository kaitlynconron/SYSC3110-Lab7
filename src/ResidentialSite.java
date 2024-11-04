public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
