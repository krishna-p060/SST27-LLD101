public class Bicycle implements Pedalable, Vehicle {
    
    public void pedal(int effort){ 
        System.out.println("Pedal effort " + effort); 
    }

    public void move() {
        System.out.println("Bicycle is moving");
    }
}