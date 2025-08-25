public class overnight extends Shipment {
    overnight(double w) {
        super(w);
    }
    @Override
    double getCost() {
        return 120 + 10 * this.getWeightKg();
    }
}
