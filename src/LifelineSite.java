public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getTax(double base) {
        return base * TAX_RATE;
    }

    @Override
    protected double getBase() {
        return _units * _rate;
    }
}
