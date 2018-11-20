package com.schedule.BaristaBoard.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "`User`")
public abstract class User {
    @Id
    @GeneratedValue()
    protected Long id;

    protected String firstName;
    protected String lastName;
    protected String password;


}