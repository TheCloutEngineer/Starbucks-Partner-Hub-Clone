package com.schedule.BaristaBoard.Model;

import javax.persistence.Entity;
import java.util.Map;

@Entity
public class Manager extends User {


    private Map<Schedule, String> weeklySchedule;

    public void setWeeklySchedule(Map<Schedule, String> weeklySchedule) { }
}
