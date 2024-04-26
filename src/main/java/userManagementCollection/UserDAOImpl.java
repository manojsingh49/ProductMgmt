package userManagementCollection;

import java.util.Scanner;

public class UserDAOImpl implements UserDAO{
    UserInfo[] addUserInfo = new UserInfo[5];
    Scanner scanner = new Scanner(System.in);


    @Override
    public void userRegister() {
        for(int i = 0; i < 5; i++){
            System.out.println("Enter User Identification Number");
            int userId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the First Name");
            String userfName = scanner.nextLine();
            System.out.println("Enter the Last Name");
            String userlName = scanner.nextLine();
            System.out.println("Enter the Phone Number");
            String userPhoneNum = scanner.nextLine();
            System.out.println("Enter the Address");
            String userAddress = scanner.nextLine();
            System.out.println("Enter the Email");
            String userEmail = scanner.nextLine();
            System.out.println("Enter User Name");
            String userName = scanner.nextLine();
            System.out.println("Enter the Password");
            String userPassword = scanner.nextLine();

            UserInfo user = new UserInfo(userId, userfName,userlName,userPhoneNum, userAddress,
                    userEmail, userName, userPassword);
            addUserInfo[i] = user;
            System.out.println("Register is Successfully!");
        }

    }

    @Override
    public boolean verifyUserNameAndPassword(String userName, String userPassword) {
        for(UserInfo user: addUserInfo){
            if(user.getuserName().equals(userName)&&user.getUserPassword().equals(userPassword)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String forgotPassword(String userName) {
        for(UserInfo user1: addUserInfo){
            if(user1.getuserName().equals(userName)){
                return user1.getUserPassword();
            }
        }
        return null;
    }
}
