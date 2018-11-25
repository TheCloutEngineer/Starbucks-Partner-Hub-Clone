package com.schedule.BaristaBoard.Controllers;

import com.schedule.BaristaBoard.Model.Schedule;
import com.schedule.BaristaBoard.Repositories.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {

        @Autowired
        ScheduleRepo scheduleRepo;

        @GetMapping(value = "/{id}")
        public Schedule getSchedulebyId(@PathVariable("id") Long id) {
            return scheduleRepo.getOne(id);
        }

        @GetMapping(value = "/")
        public List<Schedule> getAllSchedules() {
            return scheduleRepo.findAll();
        }

        @PostMapping(value = "/")
        public ResponseEntity<Schedule> createSchedule(@Valid @RequestBody Schedule schedule) {
            scheduleRepo.save(schedule);
            return new ResponseEntity<>(schedule, org.springframework.http.HttpStatus.CREATED);
        }

        @PutMapping(value = "/{id}")
        public ResponseEntity<?> updateScheduleById(@RequestBody Schedule schedule) {
            Schedule s = scheduleRepo.save(schedule);
            return new ResponseEntity<>(s, org.springframework.http.HttpStatus.OK);
        }

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<?> deleteScheduleById(@PathVariable("id") Long id) {
            scheduleRepo.deleteById(id);
            return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
        }
}
