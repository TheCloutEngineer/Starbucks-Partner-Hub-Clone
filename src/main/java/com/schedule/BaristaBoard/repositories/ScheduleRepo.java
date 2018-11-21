package com.schedule.BaristaBoard.repositories;

import com.schedule.BaristaBoard.Model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}
