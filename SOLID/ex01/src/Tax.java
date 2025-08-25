public class Tax {
    double taxRate;

    public Tax(double taxRate) {
        this.taxRate = taxRate;
    }

    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
