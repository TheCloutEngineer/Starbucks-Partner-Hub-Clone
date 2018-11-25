package com.schedule.BaristaBoard.Repositories;

import com.schedule.BaristaBoard.Model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}
