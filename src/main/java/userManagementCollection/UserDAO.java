package userManagementCollection;

public interface UserDAO {
    void userRegister();
    boolean verifyUserNameAndPassword(String userName, String userPassword);
    String forgotPassword(String userName);

}
