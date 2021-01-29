package Test;public final class EllipseBuilder {
    private double n;

    private EllipseBuilder() {
    }

    public static EllipseBuilder anEllipse() {
        return new EllipseBuilder();
    }

    public EllipseBuilder withN(double n) {
        this.n = n;
        return this;
    }

    public Ellipse build() {
        return new Ellipse(0.0d, 0.0d, 0.0d, 0.0d, n);
    }
}
