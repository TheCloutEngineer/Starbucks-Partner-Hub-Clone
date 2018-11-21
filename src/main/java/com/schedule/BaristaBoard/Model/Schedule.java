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
<<<<<<< HEAD


    //private List<LocalDate> dateList;
=======
    private LocalDate dateList;
>>>>>>> 17ec4f9da0843d52c3aea69b21a014d59172215d

    public Schedule() {
    }


}
