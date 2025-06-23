public class RetailStore {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.00);
        Customer customer = new Customer("Alice Smith", "alice@example.com");

        // Step 1: Check inventory before placing order
        boolean inStock = checkInventory(product, 2);

        if (inStock) {
            // Step 2: Create and confirm the order
            Order order = new Order(customer, product, 2);
            boolean confirmed = order.confirmOrder();

            // Step 3: Notify customer based on confirmation
            if (confirmed) {
                notifyCustomer(customer, "Your order for " + product.getName() + " has been confirmed!");
                order.printOrderSummary();
            } else {
                notifyCustomer(customer, "Sorry, your order could not be confirmed.");
            }
        } else {
            notifyCustomer(customer, "Sorry, the product is out of stock.");
        }
    }

    // Simulate inventory check
    private static boolean checkInventory(Product product, int quantity) {
        // For demo, always return true (in stock)
        return true;
    }

    // Simulate sending a notification to the customer
    private static void notifyCustomer(Customer customer, String message) {
        System.out.println("Notification sent to " + customer.getEmail() + ": " + message);
    }
}
