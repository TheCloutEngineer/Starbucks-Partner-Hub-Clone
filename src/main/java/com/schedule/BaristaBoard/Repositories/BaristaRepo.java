package com.schedule.BaristaBoard.Repositories;

import com.schedule.BaristaBoard.Model.Barista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaristaRepo extends JpaRepository<Barista, Long> {
    public Barista findByLastName(String lastName);}
