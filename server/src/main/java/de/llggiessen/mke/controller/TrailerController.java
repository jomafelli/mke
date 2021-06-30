package de.llggiessen.mke.controller;

import de.llggiessen.mke.repository.BoatRepository;
import de.llggiessen.mke.repository.TrailerRepository;
import de.llggiessen.mke.schema.Boat;
import de.llggiessen.mke.schema.Trailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/trailer")
public class TrailerController {
    @Autowired
    TrailerRepository repository;

    @GetMapping("")
    public Iterable<Trailer> getTrailer() {
        return repository.findAll();
    }

    @DeleteMapping("")
    public void deleteAll() {
        repository.deleteAll();
    }

    @PostMapping("")
    public Trailer createTrailer(@RequestBody Trailer trailer) {
        try {
            return repository.save(trailer);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
