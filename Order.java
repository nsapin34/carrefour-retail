public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean confirmOrder() {
        // Simulate confirmation logic (always true for demo)
        return true;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public void printOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + getTotalPrice());
    }
}
