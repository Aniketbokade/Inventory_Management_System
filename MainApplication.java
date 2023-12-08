// MainApplication.java
import javax.swing.*;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        // Assuming you have products and order items
        List<Product> products = ...; // Populate your product list
        List<OrderItem> orderItems = ...; // Populate your order item list

        // Sell products and get order items
        List<OrderItem> soldItems = SellProduct.showDialog(new JFrame(), products);

        // Generate sales report
        ReportGenerator.generateSalesReport(soldItems);

        // Generate inventory report
        ReportGenerator.generateInventoryReport(products);
    }
}
