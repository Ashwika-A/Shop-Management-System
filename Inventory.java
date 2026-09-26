import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully.");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product findProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void updateProduct(int id, int newQuantity) {
        Product p = findProductById(id);
        if (p != null) {
            p.setQuantity(newQuantity);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        Product p = findProductById(id);
        if (p != null) {
            products.remove(p);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public double calculateBill(int id, int qtyToBuy) {
        Product p = findProductById(id);
        if (p == null) {
            System.out.println("Product not found.");
            return 0;
        }
        if (p.getQuantity() < qtyToBuy) {
            System.out.println("Not enough stock available.");
            return 0;
        }
        double total = p.getPrice() * qtyToBuy;
        p.setQuantity(p.getQuantity() - qtyToBuy);
        return total;
    }
}