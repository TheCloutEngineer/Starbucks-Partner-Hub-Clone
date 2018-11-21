package com.schedule.BaristaBoard.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Employee> employeeId;


    //private List<LocalDate> dateList;

    public Schedule() {
    }


}
