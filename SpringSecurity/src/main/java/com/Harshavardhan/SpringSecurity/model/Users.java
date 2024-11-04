package com.Harshavardhan.SpringSecurity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users_table")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;

//    @JsonIgnore
//    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
//    private Student student;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long UserId) {
        this.userId = UserId;
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

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
