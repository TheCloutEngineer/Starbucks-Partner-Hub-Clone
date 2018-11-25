package com.schedule.BaristaBoard.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Manager extends User {

    @OneToMany(targetEntity = Barista.class, mappedBy = "managerId", fetch = FetchType.LAZY)
    private List<Barista> employeeId;

    public Manager() {
    }

    public Manager(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }

}
