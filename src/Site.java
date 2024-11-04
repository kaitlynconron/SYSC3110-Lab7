public abstract class Site {
    protected static final double TAX_RATE = 0.2;
    protected double _units;
    protected double _rate;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        double base = getBase();
        double tax = getTax(base);
        return base + tax;
    }

    protected abstract double getBase();
    protected abstract double getTax(double base);
}
