public class express extends Shipment {
    express(double w) {
        super(w);
    }
    @Override
    double getCost() {
        return 80 + 8 * this.getWeightKg();
    }
}
