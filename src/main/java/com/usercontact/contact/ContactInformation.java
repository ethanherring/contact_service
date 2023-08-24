package com.usercontact.contact;

public class ContactInformation {
    
    //Class Vars / Attributes
    private String userName;
    private String userEmail;

    //Constructor 
    public ContactInformation(String name, String email) {
        userName = name;
        userEmail = email;
    }

    //Setter Functions
    public void setName(String name) {
        this.userName = name;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    //Getter Functions
    public String getName() {
        return userName;
    }

    public String getEmail() {
        return userEmail;
    }


    


}
