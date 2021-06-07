package com.WinOrbooze.AutoDoctors.dto;

import com.WinOrbooze.AutoDoctors.modle.User;

public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String email;
    private String address;
    private String firstname;
    private String lastname;

    public UserDTO() {
    }
    public UserDTO(User user){
        this.id=user.getId();
        this.username=user.getUsername();
        this.password=user.getPassword();
        this.email=user.getEmail();
        this.address=user.getAddress();
        this.firstname=user.getFirstname();
        this.lastname=user.getLastname();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
