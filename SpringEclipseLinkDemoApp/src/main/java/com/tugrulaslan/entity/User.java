package com.tugrulaslan.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tugrul on 6/18/2015.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="activedUser")
    private boolean activedUser;

    public User() {
    }

    public User(String username, String password, boolean activedUser) {
        this.username = username;
        this.password = password;
        this.activedUser = activedUser;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public boolean isActivedUser() {
        return activedUser;
    }

    public void setActivedUser(boolean activedUser) {
        this.activedUser = activedUser;
    }

}
