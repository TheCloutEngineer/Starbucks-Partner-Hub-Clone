package com.schedule.BaristaBoard.Model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Barista extends User {

    @JoinColumn(nullable = false)
    private Long managerId;

    @OneToMany(targetEntity = Schedule.class, mappedBy = "baristaId", fetch = FetchType.LAZY)
    private List<Schedule> scheduleId;

    public Barista() {
    }
    public Barista(String firstName, String lastName, String password) {
        super(firstName, lastName, password);

    }
}