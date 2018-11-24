package com.schedule.BaristaBoard.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "`User`")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;

    public User(){}

    public User(String firstName, String lastName, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassword(password);
    }


}
