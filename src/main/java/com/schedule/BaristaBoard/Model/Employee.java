package com.schedule.BaristaBoard.Model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Employee extends User {

    boolean hasBenefits;
    List<Schedule> weeklySchedule;


    public void setBenefits() {
        this.hasBenefits = true;
    }

}
