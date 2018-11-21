package com.schedule.BaristaBoard.repositories;

import com.schedule.BaristaBoard.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
