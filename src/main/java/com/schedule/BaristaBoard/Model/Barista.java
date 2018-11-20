package com.schedule.BaristaBoard.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Barista extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long baristaId;

    @Column(name = "benefits")
    private boolean hasBenefits;

    private List<Schedule> weeklySchedule;

    @Column(name = "time_in")
    private LocalDateTime punchIn;

    @Column(name = "time_out")
    private LocalDateTime punchOut;


    public void setBenefits() {
        this.hasBenefits = true;
    }

}
