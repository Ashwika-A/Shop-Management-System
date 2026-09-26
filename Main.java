import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shop Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Buy Product (Billing)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    inventory.addProduct(new Product(id, name, price, qty));
                    break;

                case 2:
                    inventory.viewProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    inventory.updateProduct(updateId, newQty);
                    break;

                case 4:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();
                    inventory.deleteProduct(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Product ID to buy: ");
                    int buyId = sc.nextInt();
                    System.out.print("Enter quantity to buy: ");
                    int buyQty = sc.nextInt();
                    double total = inventory.calculateBill(buyId, buyQty);
                    if (total > 0) {
                        System.out.println("Total bill amount: Rs." + total);
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}