package userManagementCollection;

import java.util.Scanner;

public class UserClient{
    static Scanner scanner = new Scanner(System.in);
    static UserDAOImpl implDAO = new UserDAOImpl();

    public static void main(String[] args) {


    while(true) {
        System.out.println("1.Create Account");
        System.out.println("2.Sign In");
        System.out.println("3.Forgot Password");
        System.out.println("4.Exit");
        System.out.println("==========================================================");
        System.out.println("Enter the choice");
        int choice = scanner.nextInt();
        switch ((choice)) {
            case 1:
                implDAO.userRegister();
                break;
            case 2:
                System.out.println("Enter User Name");
                String userName = scanner.next();
                System.out.println("Enter the Password");
                String userPassword = scanner.next();
                boolean flag = implDAO.verifyUserNameAndPassword(userName, userPassword);
                if (flag) {
                    System.out.println("Username and password are correct.");
                } else {
                    System.out.println("Username and password aren't correct");
                }
            case 3:
                System.out.println("Enter User Name");
                String name = scanner.next();
                String password = implDAO.forgotPassword(name);
                if (password != null) {
                    System.out.println("Your password: " + password);
                } else {
                    System.out.println("User name isn't exist.");
                    break;
                }
            case 4:
                System.out.println(" We appreciate you for using application");
                System.exit(0);
            default:
                System.out.println("Choose 1 to 4 between");
        }


    }

    }
}
