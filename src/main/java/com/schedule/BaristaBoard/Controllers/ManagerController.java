package com.schedule.BaristaBoard.Controllers;

import com.schedule.BaristaBoard.Model.Manager;
import com.schedule.BaristaBoard.Repositories.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    ManagerRepo managerRepo;



    @PreAuthorize("hasAnyRole('Manager')")
    @GetMapping(value = "/secured/{id}")
    public Manager getManagerbyId(@PathVariable("id") Long id) {
        return managerRepo.getOne(id);
    }

    @PreAuthorize("hasAnyRole('Manager')")
    @GetMapping(value = "/")
    public List<Manager> getAllManagers() {
        return managerRepo.findAll();
    }

    @PreAuthorize("hasAnyRole('Manager')")
    @PostMapping(value = "/")
    public ResponseEntity<Manager> createManager(@Valid @RequestBody Manager administrator) {
        managerRepo.save(administrator);
        return new ResponseEntity<>(administrator, org.springframework.http.HttpStatus.CREATED);
    }

    @PreAuthorize("hasAnyRole('Manager')")
    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateManagerById(@RequestBody Manager administrator) {
        Manager a = managerRepo.save(administrator);
        return new ResponseEntity<>(a, org.springframework.http.HttpStatus.OK);
    }

    @PreAuthorize("hasAnyRole('Manager')")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteManagerById(@PathVariable("id") Long id) {
        managerRepo.deleteById(id);
        return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
    }

}
