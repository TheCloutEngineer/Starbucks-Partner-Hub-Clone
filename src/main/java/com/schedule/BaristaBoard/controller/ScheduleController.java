package com.schedule.BaristaBoard.controller;

import com.schedule.BaristaBoard.Model.Employee;
import com.schedule.BaristaBoard.Model.Schedule;
import com.schedule.BaristaBoard.repositories.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {

        @Autowired
        ScheduleRepo scheduleRepo;

        @GetMapping(value = "/{id}")
        public Optional<Schedule> getSchedulebyId(@PathVariable("id") Long id) {
            return scheduleRepo.findById(id);
        }

        @GetMapping(value = "/")
        public List<Schedule> getAllSchedules() {
            return scheduleRepo.findAll();
        }

        @PostMapping(value = "/")
        public ResponseEntity<Schedule> create(@Valid @RequestBody Schedule schedule) {
            scheduleRepo.save(schedule);
            return new ResponseEntity<>(schedule, org.springframework.http.HttpStatus.CREATED);
        }

        @PutMapping(value = "/{id}")
        public ResponseEntity<?> update(@RequestBody Schedule schedule) {
            Schedule s = scheduleRepo.save(schedule);
            return new ResponseEntity<>(s, org.springframework.http.HttpStatus.OK);
        }

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<?> delete(@PathVariable("id") Long id) {
            scheduleRepo.deleteById(id);
            return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
        }
}
