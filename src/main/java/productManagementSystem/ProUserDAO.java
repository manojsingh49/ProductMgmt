package productManagementSystem;
public interface ProUserDAO {
    void addUser(UserDetails userDetails);
    UserDetails getUserNameAndPassword(String username);


}