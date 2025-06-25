class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
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
