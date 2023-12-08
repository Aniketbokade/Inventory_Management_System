// ReportGenerator.java
import java.util.List;

public class ReportGenerator {
    public static void generateSalesReport(List<OrderItem> orderItems) {
        System.out.println("Sales Report:");

        // You can customize the report format based on your requirements
        for (OrderItem orderItem : orderItems) {
            Product product = orderItem.getProduct();
            System.out.println("Product: " + product.getName() +
                    ", Quantity Sold: " + orderItem.getQuantity() +
                    ", Total Sales: $" + (product.getPrice() * orderItem.getQuantity()));
        }

        System.out.println();
    }

    public static void generateInventoryReport(List<Product> products) {
        System.out.println("Inventory Report:");

        for (Product product : products) {
            System.out.println("Product: " + product.getName() +
                    ", Available Quantity: " + product.getQuantity() +
                    ", Net Weight: " + product.getWeight() + " " + product.getWeightUnit());
        }

        System.out.println();
    }
}
