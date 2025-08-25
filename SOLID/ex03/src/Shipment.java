public abstract class Shipment {
    double weightKg;
    Shipment(double w){ 
        this.weightKg=w; 
    }
    double getWeightKg(){
        return weightKg;
    }
    
    abstract double getCost();
}