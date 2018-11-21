package com.schedule.BaristaBoard.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Administrator extends User {

    @Id
    @OneToMany(targetEntity = Employee.class, mappedBy = "administratorId", fetch = FetchType.LAZY)
    private List<Employee> employeeId;

public Administrator(Long id, String firstname, String lastname, String password ){
    this.id = id;
    this.firstName = firstname;
    this.lastName = lastname;
    this.password = password;
}

}
