package com.cydeo.review;

public class User {

    public String username;
    public String firstname;
    public Role role;

    public User(String username, String firstname, Role role) {
        this.username = username;
        this.firstname = firstname;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", role=" + role +
                '}';
    }
}
