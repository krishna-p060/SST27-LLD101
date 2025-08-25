public class OrderController {
    IOrderRepository repo;

    public OrderController(IOrderRepository repo) {
        this.repo = repo;
    }

    public void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id + " with SQL repository");
    }
}