package com.anmaza.friendsleague.entities;

import android.net.Uri;
import android.provider.MediaStore;

public class Users {

    public String email, password, username;

    public Users(){
    }

    public Users(String email, String password, String username){
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
