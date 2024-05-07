
package ooadproject;

public class User {
    private String username;
    private String name;
    private String surname;
    private String bloodType;
    private String emailAdress;
    private String password;
    private String phoneNumber;
    private String adress;

    public User(String username, String name, String surname, String bloodType, String emailAdress, String password, String phoneNumber, String adress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.bloodType = bloodType;
        this.emailAdress = emailAdress;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
    
    
}
