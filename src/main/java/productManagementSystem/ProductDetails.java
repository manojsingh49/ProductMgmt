package productManagementSystem;

import java.util.List;
import java.util.Scanner;

class ProductDetails{
    private  ProductDAO productDAO;
    private Scanner scanner;
    private UserDetails userDetails;

    public ProductDetails(ProductDAO productDAO, Scanner scanner,UserDetails userDetails) {
        this.productDAO = productDAO;
        this.scanner = scanner;
        this.userDetails = userDetails;
    }

   


    public void productMenu(){
        int choice;
        do{
            System.out.println("\nProduct Menu");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. View Product");
            System.out.println("4. Back");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    viewProduct(userDetails);
                    break;
                case 4:
                    System.out.println("Existing product menu..");
                    break;
                default:
                    System.out.println("Invalid choice.Please try again");
            }
        }while (choice!= 4);
    }

    private void addProduct() {
        System.out.println("Enter product ID Number");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter product quantity:");
        int productQty = scanner.nextInt();
        System.out.println("Enter product price");
        double price= scanner.nextDouble();
        scanner.nextLine();
        Products products = new Products();
        products.setProductName(productName);
        products.setProductQty(productQty);
        products.setPrice(price);

        productDAO.addProduct(products);
        System.out.println("Product added successfully!!");
    }
    private void viewAllProducts() {
        List<Products>products = productDAO.getAllProducts();
        if(products.isEmpty()){
            System.out.println("No products found.");
        }else{
            System.out.println("Here are the all products:");
            int productId = 1;
            for(Products products1: products){
                System.out.println("Product ID: "+ products1.getProductId());
                System.out.println("Product name: "+ products1.getProductName());
                System.out.println("Quantity: "+ products1.getProductQty());
                System.out.println("Price: "+ products1.getPrice());
                System.out.println();
                productId++;
            }
        }
    }
    void viewProduct(UserDetails userDetails) {
        System.out.println("Enter product ID: ");
        int pid = scanner.nextInt();
        scanner.nextLine();

        Products products = productDAO.getProductById(pid);
        if(products == null){
            System.out.println("Product not found");
        }else {
            System.out.println("Product Details:");
            System.out.println("Product ID: "+ products.getProductId());
            System.out.println("Product name: "+ products.getProductName());
            System.out.println("Quantity: "+ products.getProductQty());
            System.out.println("Price: "+ products.getPrice());
        }
    }


}

