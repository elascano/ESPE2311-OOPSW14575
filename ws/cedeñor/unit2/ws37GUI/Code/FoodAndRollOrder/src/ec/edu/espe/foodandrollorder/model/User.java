package ec.edu.espe.foodandrollorder.model;

import java.util.Date;

public class User {

    protected String userId;
    protected String password;
    protected String loginStatus;
    protected Date registerDate;

    public User(String userId, String password, String loginStatus, Date registerDate) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + getUserId() + ", password=" + getPassword() + ", loginStatus=" + getLoginStatus() + ", registerDate=" + getRegisterDate() + '}';
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the loginStatus
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    /**
     * @param loginStatus the loginStatus to set
     */
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * @return the registerDate
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public static void verifyLogin() {

    }
}
