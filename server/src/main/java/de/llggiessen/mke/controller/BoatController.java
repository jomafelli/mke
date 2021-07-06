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
    public Iterable<Boat> getBoatsBySeats4(@RequestParam(value = "seats", required = false, defaultValue = "") int seats) {
        return repository.findAllBySeats4(seats);
    }

    @GetMapping("")
    public Iterable<Boat> getBoatsBySeats3(@RequestParam(value = "seats", required = false, defaultValue = "") int seats) {
        return repository.findAllBySeats3(seats);
    }

    @GetMapping("")
    public Iterable<Boat> getBoatsByStatusGood(@RequestParam(value = "status", required = false, defaultValue = "") Boat.Status status) {
        return repository.findAllByStatusGOOD(status);
    }

    @GetMapping("")
    public Iterable<Boat> getBoatsByStatusBroken(@RequestParam(value = "status", required = false, defaultValue = "") Boat.Status status) {
        return repository.findAllByStatusBROKEN(status);
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
