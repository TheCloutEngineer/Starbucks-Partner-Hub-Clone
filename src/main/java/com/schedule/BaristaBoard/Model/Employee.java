package com.schedule.BaristaBoard.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table
public class Employee extends User {

    //@Column(name="admin_id",nullable=false)
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
