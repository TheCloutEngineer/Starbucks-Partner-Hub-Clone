package com.schedule.BaristaBoard.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table
public class Manager extends User {

    @OneToMany(targetEntity = Barista.class, mappedBy = "administratorId", fetch = FetchType.LAZY)
    private List<Barista> employeeId;

public Manager(){}
    public Manager(String firstName, String lastName, String password ){
       super(firstName, lastName, password);
}

}
