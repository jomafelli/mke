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

    @GetMapping(value = "", params = "id")
    public Boat getBoatsById(@RequestParam Long id) {
        return repository.findById(id).orElseThrow(()->{
            return new ResponseStatusException(HttpStatus.BAD_REQUEST);
        });
    }

    @GetMapping(value = "", params = "seats")
    public Iterable<Boat> getBoatsBySeats(@RequestParam int seats) {
        return repository.findAllBySeats(seats);
    }

    @GetMapping("")
    public Iterable<Boat> getBoatsByStatus(@RequestParam(value = "status") String status) {
        return repository.findAllByStatus(status);
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
