package de.llggiessen.mke.controller;

import de.llggiessen.mke.repository.BoatRepository;
import de.llggiessen.mke.schema.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping(path = "/boat")
public class BoatController {
    @Autowired
    BoatRepository repository;

    @GetMapping("")
    public Iterable<Boat> getUsers() {
        return repository.findAll();
    }

    @DeleteMapping("")
    public void deleteAll() {
        repository.deleteAll();
    }

    @PostMapping("")
    public Boat createBoat(@RequestBody Boat boat) {
        try {
            return repository.save(boat);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
