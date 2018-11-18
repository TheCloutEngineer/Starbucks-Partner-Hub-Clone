package com.schedule.BaristaBoard.Model;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Administrator extends User {

    List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Map<Schedule, String> makeSchedule() {

        return new HashMap<Schedule, String>();
    }
}
