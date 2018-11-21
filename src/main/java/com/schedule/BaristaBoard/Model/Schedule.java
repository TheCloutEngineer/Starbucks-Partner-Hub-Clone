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
    private List<Barista> employeeId;
    private LocalDate date;
    private String time;
    public Schedule() {
    }


}
