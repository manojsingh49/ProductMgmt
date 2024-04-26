package productManagementSystem;

import productManagementSystem.ProUserDAO;
import productManagementSystem.ProductDetails;

import java.util.Scanner;

public class ProductClient {
    private ProUserDAO proUserDAO;
    private ProductDAO productDAO;
    private ProductDetails productDetails;
    private Scanner scanner;
    private UserDetails users;

    public ProductClient() {
        proUserDAO = new ProUserDAOImp();
        productDAO = new ProductDAOImpl();
        scanner = new Scanner(System.in);
        productDetails = new ProductDetails(productDAO,scanner, users);

    }



    public void start() {
        int choice;
        do {
            System.out.println("\nProduct Management System");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    signIn();
                    break;
                case 3:
                    forgotPassword();
                    break;
                case 4:
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Invalid choice.Please try again");
            }
        }while (choice != 4);

    }

    private void signUp() {
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter user name:");
        String username = scanner.nextLine();
        System.out.print("Enter password:");
        String password = scanner.nextLine();

        UserDetails userDetails = new UserDetails();
        userDetails.setName(name);
        userDetails.setUsername(username);
        userDetails.setPassword(password);
        proUserDAO.addUser(userDetails);
        System.out.println("User registered successfully.");
    }

    private void signIn() {
        System.out.println("Enter user name:");
        String username = scanner.nextLine();
        System.out.println("Enter the Password:");
        String password = scanner.nextLine();

        UserDetails userDetails = proUserDAO.getUserNameAndPassword(username);
        if(userDetails != null && userDetails.getPassword().equals(password)){
            users =userDetails;
            System.out.println("sign in successful.Welcome, "+ userDetails.getName());
            productDetails = new ProductDetails(productDAO, scanner, userDetails);
            productDetails.productMenu();
        }else{
            System.out.println("Invalid username or password");
        }

    }

    private void forgotPassword() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter the Password:");
        String password = scanner.nextLine();
        UserDetails userDetails = proUserDAO.getUserNameAndPassword(username);
        if(userDetails != null){
            System.out.println("Your password is :"+ userDetails.getPassword());
        }else {
            System.out.println("User not found");
        }

        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAOImpl();
        UserDetails userDetails = new UserDetails();
        ProductDetails productDetails = new ProductDetails(productDAO, scanner, userDetails);
        ProductClient productClient = new ProductClient();
        productClient.start();
    }
}
