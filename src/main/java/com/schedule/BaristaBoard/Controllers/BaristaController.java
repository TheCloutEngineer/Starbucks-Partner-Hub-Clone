package com.schedule.BaristaBoard.Controllers;

import com.schedule.BaristaBoard.Model.Barista;
import com.schedule.BaristaBoard.Repositories.BaristaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/barista")
public class BaristaController {
    @Autowired
    BaristaRepo baristaRepo;

    @GetMapping(value = "/{id}")
    public Barista getBaristabyId(@PathVariable("id") Long id) {
        return baristaRepo.getOne(id);
    }

    @GetMapping(value = "/")
    public List<Barista> getAllBarista() {
        return baristaRepo.findAll();
    }

    @PostMapping(value = "/")
    public ResponseEntity<Barista> createBarista(@Valid @RequestBody Barista employee) {
        baristaRepo.save(employee);
        return new ResponseEntity<>(employee, org.springframework.http.HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateBarista(@RequestBody Barista employee) {
        Barista e = baristaRepo.save(employee);
        return new ResponseEntity<>(e, org.springframework.http.HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteBarista(@PathVariable("id") Long id) {
        baristaRepo.deleteById(id);
        return new ResponseEntity<>(org.springframework.http.HttpStatus.OK);
    }
}
