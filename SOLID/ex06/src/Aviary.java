public class Aviary {
    public void release(Bird b){ 
        if(b instanceof Flyable){
            ((Flyable) b).fly();
        } 
        else{
            System.out.println("Can't release");
        }
    }
}