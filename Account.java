package testing.com.myapplication;

//Server side class that stores account data
//Changelog:
//Casey Puentes 10:41AM 12-18-18
//
//
//

public class Account {
    private int UserID = -1; //Users accounts unique ID
    private String firstName; //Users first name
    private String lastName; //Users last name
    private String phoneNumber = "-1"; //Users phone number FMT: (XXX)XXX-XXXX;
    private int rewardPoints = 0; //Amount of reward points the user has
    private String email; //Users e-mail, functions as password
    private String password; //Users password


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void addRewardPoints(int amount)
    {
        this.rewardPoints += amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean passwordIsCorrect(String password)
    {
        return (this.password == password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
