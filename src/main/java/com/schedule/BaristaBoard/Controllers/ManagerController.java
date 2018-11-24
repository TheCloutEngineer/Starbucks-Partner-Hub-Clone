package com.schedule.BaristaBoard.Controllers;

import com.schedule.BaristaBoard.Model.Manager;
import com.schedule.BaristaBoard.Repositories.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    ManagerRepo managerRepo;

    @GetMapping(value = "/{id}")
    public Manager getAdminbyId(@PathVariable("id") Long id) {
        return managerRepo.getOne(id);
    }

    @GetMapping(value = "/")
    public List<Manager> getAllAdmins() {
        return managerRepo.findAll();
    }

    @PostMapping(value = "/")
    public ResponseEntity<Manager> create(@Valid @RequestBody Manager administrator) {
        managerRepo.save(administrator);
        return new ResponseEntity<>(administrator, org.springframework.http.HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@RequestBody Manager administrator) {
        Manager a = managerRepo.save(administrator);
        return new ResponseEntity<>(a, org.springframework.http.HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        managerRepo.deleteById(id);
        return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
    }

}
