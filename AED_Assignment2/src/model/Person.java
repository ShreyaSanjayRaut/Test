package model;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;

public class Person {
    private String userID;
    private String passwordHash; // Store password as a hash
    private String neduID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ArrayList<String> passwordList;
    private String Role;
    private Boolean Status;

    public Person(String userID, String passwordHash, String neduID, String firstName, String lastName, String phoneNumber, ArrayList<String> passwordList, String Role, Boolean Status) {
        this.userID = userID;
        this.passwordHash = passwordHash;
        this.neduID = neduID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.passwordList = passwordList;
        this.Role = Role;
        this.Status = Status;
    }

   
    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    // Constructors
    public Person() {
        // Default constructor
    }

    
    

    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(ArrayList<String> passwordList) {
        this.passwordList = passwordList;
    }

    


    // Getter and Setter methods for all fields

    // Password hashing method
    public String hashPassword(String password) {
       
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception appropriately
            e.printStackTrace();
            return null;
        }
        
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPassword(String password) {
        this.passwordHash = hashPassword(password);
    }

    public String getNeduID() {
        return neduID;
    }

    public void setNeduID(String neduID) {
        this.neduID = neduID;
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

    
    @Override
    public String toString() {
        return neduID;
    }

    public String getPassword(String password) {
       String hashPassword = hashPassword(password);
       return hashPassword;
    }
    
    public   ArrayList<String> addPassword(String password){

        this.passwordList = new ArrayList<String>();             
        this.passwordList.add(getPassword(password));
        return this.passwordList;
    }
}

