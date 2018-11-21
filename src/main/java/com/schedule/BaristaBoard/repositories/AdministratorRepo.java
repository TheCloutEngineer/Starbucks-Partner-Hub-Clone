package com.schedule.BaristaBoard.repositories;

import com.schedule.BaristaBoard.Model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepo extends JpaRepository<Administrator, Long> {
}
