package productManagementSystem;



import java.util.ArrayList;
import java.util.List;

class ProUserDAOImp  implements ProUserDAO {
    private List<UserDetails>userDetails = new ArrayList<>();


    @Override
    public void addUser(UserDetails userDetails) {
        this.userDetails.add(userDetails);
    }

    @Override
    public UserDetails getUserNameAndPassword(String userName) {
        for(UserDetails userDetails1: userDetails){
            if(userDetails1.getUsername().equals(userName)){
                return userDetails1;
            }
        }
        return null;
    }
}
