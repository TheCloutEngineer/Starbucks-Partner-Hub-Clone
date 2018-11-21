package com.schedule.BaristaBoard.controller;

import com.schedule.BaristaBoard.Model.Administrator;
import com.schedule.BaristaBoard.repositories.AdministratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdministratorRepo administratorRepo;

    @GetMapping(value = "/{id}")
    public Optional<Administrator> getAdminbyId(@PathVariable("id") Long id) {
        return administratorRepo.findById(id);
    }

    @GetMapping(value = "/")
    public List<Administrator> getAllAdmins() {
        return administratorRepo.findAll();
    }

    @PostMapping(value = "/")
    public ResponseEntity<Administrator> create(@Valid @RequestBody Administrator administrator) {
        administratorRepo.save(administrator);
        return new ResponseEntity<>(administrator, org.springframework.http.HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@RequestBody Administrator administrator) {
        Administrator a = administratorRepo.save(administrator);
        return new ResponseEntity<>(a, org.springframework.http.HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        administratorRepo.deleteById(id);
        return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
    }

}
