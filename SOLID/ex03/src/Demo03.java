public class Demo03 {
    public static void main(String[] args) {
        Shipment s1 = new standard(2.0);
        System.out.println(s1.getCost());

        Shipment s2 = new express(2.0);
        System.out.println(s2.getCost());

        Shipment s3 = new overnight(2.0);
        System.out.println(s3.getCost());
    }
}
