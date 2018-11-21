package com.schedule.BaristaBoard.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private LocalDate date;
    private String time;
    private Long baristaId;

    public Schedule() {

    }


}
