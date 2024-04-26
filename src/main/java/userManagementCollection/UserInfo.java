package userManagementCollection;

public class UserInfo {
    private int userId;
    private String userfName;
    private String userlName;
    private String userPhoneNum;
    private String userAddress;


    private String userEmail;
    private String userName;
    private String userPassword;


    public UserInfo(int userId, String userfName, String userlName, String userPhoneNum,
                    String userAddress, String userEmail, String userName, String userPassword) {


        this.userId = userId;
        this.userfName = userfName;
        this.userlName = userlName;
        this.userPhoneNum = userPhoneNum;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    // Default Constructor.
    public UserInfo() {
        super();

    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserfName() {
        return userfName;
    }

    public void setUserfName(String userfName) {
        this.userfName = userfName;
    }

    public String getUserlName() {
        return userlName;
    }

    public void setUserlName(String userlName) {
        this.userlName = userlName;
    }



    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
