package com.schedule.BaristaBoard.Repositories;

import com.schedule.BaristaBoard.Model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Long> {
    public Manager findByLastName(String lastName);
}
