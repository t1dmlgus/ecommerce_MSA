package com.t1dmlgus.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, unique = true)
    private String encryptedPwd;


    public User(String email, String name, String userId, String encryptedPwd) {
        this.email = email;
        this.name = name;
        this.userId = userId;
        this.encryptedPwd = encryptedPwd;
    }
}
