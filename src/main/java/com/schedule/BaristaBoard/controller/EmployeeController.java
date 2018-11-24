package com.schedule.BaristaBoard.controller;

import com.schedule.BaristaBoard.Model.Employee;
import com.schedule.BaristaBoard.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeebyId(@PathVariable("id") Long id) {
        return employeeRepo.findById(id);
    }

    @GetMapping(value = "/")
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @PostMapping(value = "/")
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee) {
        employeeRepo.save(employee);
        return new ResponseEntity<>(employee, org.springframework.http.HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@RequestBody Employee employee) {
        Employee e = employeeRepo.save(employee);
        return new ResponseEntity<>(e, org.springframework.http.HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        employeeRepo.deleteById(id);
        return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
    }
}
