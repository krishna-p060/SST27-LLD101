public class standard extends Shipment{
    standard(double w){
        super(w);
    }

    @Override
    double getCost() {
        return 50 + 5*this.getWeightKg();
    }
    
}
