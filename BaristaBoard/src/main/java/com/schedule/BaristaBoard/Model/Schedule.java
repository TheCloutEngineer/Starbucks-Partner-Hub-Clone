package com.schedule.BaristaBoard.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    private Long employeeId;

    List<LocalDate> dateList;

    public Schedule() {
    }

    public Schedule(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
