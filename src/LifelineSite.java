public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
