**Shop Management System**

A console-based Shop Management System built in Java to manage products, inventory, and customer billing. This project applies core Object-Oriented Programming principles and Java Collections to organize and process product data.

## Features

- **Add Product** — Add new products with ID, name, price, and quantity
- **View Products** — Display all products currently in inventory
- **Update Product** — Update the stock quantity of an existing product
- **Delete Product** — Remove a product from inventory
- **Billing** — Select a product and quantity to calculate the total bill, automatically reducing stock

## Concepts Used

- Object-Oriented Programming (encapsulation, constructors, classes)
- Java Collections (`ArrayList`, `List`)
- CRUD operations (Create, Read, Update, Delete)
- Console-based user interaction using `Scanner`

## Project Structure

```
├── Product.java     # Represents a single product (id, name, price, quantity)
├── Inventory.java   # Manages the list of products and CRUD/billing logic
└── Main.java        # Console menu that ties everything together
```

## How to Run

1. Make sure Java (JDK) is installed on your system
2. Compile all files:
   ```
   javac Product.java Inventory.java Main.java
   ```
3. Run the program:
   ```
   java Main
   ```
4. Follow the on-screen menu to add, view, update, delete, or bill products

## Sample Usage

```
--- Shop Management System ---
1. Add Product
2. View Products
3. Update Product Quantity
4. Delete Product
5. Buy Product (Billing)
6. Exit
Enter choice: 1
Enter ID: 101
Enter Name: Notebook
Enter Price: 40
Enter Quantity: 100
Product added successfully.
```
