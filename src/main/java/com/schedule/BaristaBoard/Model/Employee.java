package com.schedule.BaristaBoard.Model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Employee extends User {

    @JoinColumn(name="administrator", nullable=false)
    private Long administratorId;

    @OneToMany(targetEntity = Schedule.class, mappedBy = "employeeId", fetch = FetchType.LAZY)
    private List<Schedule> scheduleId;

    public Employee(Long id, String firstname, String lastname, String password) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.password = password;
    }
}
